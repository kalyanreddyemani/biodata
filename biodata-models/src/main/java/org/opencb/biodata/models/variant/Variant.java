/*
 * Copyright 2015 OpenCB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.opencb.biodata.models.variant;

import org.opencb.biodata.models.variant.avro.VariantAnnotation;
import org.opencb.biodata.models.variant.avro.VariantAvro;
import org.opencb.biodata.models.variant.avro.VariantType;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Jacobo Coll;
 * @author Cristina Yenyxe Gonzalez Garcia &lt;cyenyxe@ebi.ac.uk&gt;
 */
public class Variant {

    private final VariantAvro impl;
    private Map<String, VariantSourceEntry> sourceEntries = null;

    public static final int SV_THRESHOLD = 50;

    public Variant() {
        this("", -1, -1, "", "", "");
    }

    public Variant(VariantAvro avro) {
        impl = avro;
    }

    /**
     *
     * @param variantString
     */
    public Variant(String variantString) {
        impl = new VariantAvro();
        if (variantString != null && !variantString.isEmpty()) {
            String[] fields = variantString.split(":", -1);
            if (fields.length == 3) {
                impl.setChromosome(fields[0]);
                impl.setStart(Integer.parseInt(fields[1]));
                impl.setReference("");
                impl.setAlternate(fields[2]);
            } else {
                if (fields.length == 4) {
                    impl.setChromosome(fields[0]);
                    impl.setStart(Integer.parseInt(fields[1]));
                    impl.setReference(fields[2]);
                    impl.setAlternate(fields[3]);
                } else {
                    throw new IllegalArgumentException("Variant needs 3 or 4 fields separated by ':'");
                }
            }
        }
    }

    public Variant(String chromosome, int position, String reference, String alternate) {
        this(chromosome, position, position, reference, alternate, "+");
    }

    public Variant(String chromosome, int start, int end, String reference, String alternate) {
        this(chromosome, start, end, reference, alternate, "+");
    }

    public Variant(String chromosome, int start, int end, String reference, String alternate, String strand) {
        impl = new VariantAvro(chromosome,
                start,
                end,
                (reference != null) ? reference : "",
                (alternate != null) ? alternate : "",
                strand,
                new LinkedList<>(),
                0,
                null,
                new HashMap<>(),
                new LinkedList<>(),
                null);
        if (start > end && !(reference.equals("-"))) {
            throw new IllegalArgumentException("End position must be greater than the start position");
        }

        this.resetLength();
        this.resetType();
        this.resetHGVS();

//        this.annotation = new VariantAnnotation(this.chromosome, this.start, this.end, this.reference, this.alternate);
        sourceEntries = new HashMap<>();
    }

    private void resetType() {
        if (getReference().length() == getAlternate().length()) {
            if (getLength() > 1) {
                setType(VariantType.MNV);
            } else {
                setType(VariantType.SNV);
            }
        } else {
            if (getLength() <= SV_THRESHOLD) {
            /*
            * 3 possibilities for being an INDEL:
            * - The value of the ALT field is <DEL> or <INS>
            * - The REF allele is not . but the ALT is
            * - The REF allele is . but the ALT is not
            * - The REF field length is different than the ALT field length
            */
                setType(VariantType.INDEL);
            } else {
                setType(VariantType.SV);
            }
        }
    }

    private void resetLength() {
        setLength(Math.max(getReference().length(), getAlternate().length()));
    }

    public void resetHGVS() {
        if (this.getType() == VariantType.SNV || this.getType() == VariantType.SNP) { // Generate HGVS code only for SNVs
            List<String> hgvsCodes = new LinkedList<>();
            hgvsCodes.add(getChromosome() + ":g." + getStart() + getReference() + ">" + getAlternate());
            impl.getHgvs().put("genomic", hgvsCodes);
        }
    }
    public VariantAvro getImpl() {
        return impl;
    }

    public final void setChromosome(String chromosome) {
        if (chromosome == null || chromosome.length() == 0) {
            throw new IllegalArgumentException("Chromosome must not be empty");
        }
        // Replace "chr" references only at the beginning of the chromosome name
        // For instance, tomato has SL2.40ch00 and that should be kept that way
        if (chromosome.startsWith("chrom") || chromosome.startsWith("chrm")
                || chromosome.startsWith("chr") || chromosome.startsWith("ch")) {
            impl.setChromosome(chromosome.replaceFirst("chrom|chrm|chr|ch", ""));
        } else {
            impl.setChromosome(chromosome);
        }
    }

    public final void setStart(Integer start) {
        if (start < 0) {
            throw new IllegalArgumentException("Start must be positive");
        }
        impl.setStart(start);
    }

    public final void setEnd(Integer end) {
        if (end < 0) {
            throw new IllegalArgumentException("End must be positive");
        }
        impl.setEnd(end);
    }

    public void setReference(String reference) {
        impl.setReference(reference);
        resetLength();
    }

    public void setAlternate(String alternate) {
        impl.setAlternate(alternate);
        resetLength();
    }

    @Deprecated
    public String getId() {
        if (impl.getIds() == null) {
            return null;
        } else {
            return impl.getIds().stream().collect(Collectors.joining(";"));
        }
    }

    @Deprecated
    public void setId(String id) {
        if (impl.getIds() == null) {
            impl.setIds(new LinkedList<>());
        }
        impl.getIds().add(id);
    }

    public String getChromosome() {
        return impl.getChromosome();
    }

    public Integer getStart() {
        return impl.getStart();
    }

    public Integer getEnd() {
        return impl.getEnd();
    }

    public String getReference() {
        return impl.getReference();
    }

    public String getAlternate() {
        return impl.getAlternate();
    }

    public String getStrand() {
        return impl.getStrand();
    }

    public void setStrand(String strand) {
        impl.setStrand(strand);
    }

    public List<String> getIds() {
        return impl.getIds();
    }

    public void setIds(List<String> value) {
        impl.setIds(value);
    }

    public Integer getLength() {
        return impl.getLength();
    }

    public void setLength(Integer value) {
        impl.setLength(value);
    }

    public VariantType getType() {
        return impl.getType();
    }

    public void setType(VariantType value) {
        impl.setType(value);
    }

    public Map<String, List<String>> getHgvs() {
        return impl.getHgvs();
    }

    public void setHgvs(Map<String, List<String>> value) {
        impl.setHgvs(value);
    }

    public VariantAnnotation getAnnotation() {
        return impl.getAnnotation();
    }

    public void setAnnotation(VariantAnnotation value) {
        impl.setAnnotation(value);
    }

    public boolean addHgvs(String type, String value) {
        List<String> listByType = getHgvs().get(type);
        if (listByType == null) {
            listByType = new LinkedList<>();
        }
        if (!listByType.contains(value)) {
            return listByType.add(value);
        } else {
            return false; //Collection has not changed
        }
    }

    public List<VariantSourceEntry> getStudies() {
        return Collections.unmodifiableList(new ArrayList<>(getSourceEntries().values()));
    }

    public void setStudies(List<VariantSourceEntry> studies) {
        sourceEntries = new HashMap<>(studies.size());
        impl.setStudies(new ArrayList<>(studies.size()));
        for (VariantSourceEntry study : studies) {
            impl.getStudies().add(study.getImpl());
            sourceEntries.put(composeId(study.getStudyId()), study);
        }
    }

    public Map<String, VariantSourceEntry> getSourceEntries() {
        if (impl.getStudies() != null) {
            if (sourceEntries == null) {
                sourceEntries = new HashMap<>();
                for (org.opencb.biodata.models.variant.avro.VariantSourceEntry sourceEntry : impl.getStudies()) {
                    sourceEntries.put(composeId(sourceEntry.getStudyId()), new VariantSourceEntry(sourceEntry));
                }
            }
            return Collections.unmodifiableMap(sourceEntries);
        }
        return null;
    }

    public VariantSourceEntry getSourceEntry(String studyId) {
        return getSourceEntry(null, studyId);
    }

    @Deprecated
    public VariantSourceEntry getSourceEntry(String fileId, String studyId) {
        if (impl.getStudies() != null) {
            return getSourceEntries().get(composeId(studyId));
        }
        return null;
    }

    public void setSourceEntries(Map<String, VariantSourceEntry> sourceEntries) {
        this.sourceEntries = sourceEntries;
        impl.setStudies(new ArrayList<>(sourceEntries.size()));
        for (VariantSourceEntry sourceEntry : sourceEntries.values()) {
            impl.getStudies().add(sourceEntry.getImpl());
        }
    }

    public void addSourceEntry(VariantSourceEntry sourceEntry) {
        if (sourceEntries == null) {
            sourceEntries = new HashMap<>();
        }
        this.sourceEntries.put(composeId(sourceEntry.getStudyId()), sourceEntry);
        impl.getStudies().add(sourceEntry.getImpl());
    }
//
//    public VariantStats getStats(String studyId, String fileId) {
//        VariantSourceEntry file = getSourceEntry(studyId, fileId);
//        if (file == null) {
//            return null;
//        }
//        return file.getStats();
//    }

//    public void setStats(VariantStats stats) {
//        this.stats = stats;
//    }

//    public VariantAnnotation getAnnotation() {
//        return annotation;
//    }

//    public void setAnnotation(VariantAnnotation annotation) {
//        this.annotation = annotation;
//    }

//    @Deprecated
//    public void addEffect(String allele, VariantEffect ct) {
////        annotation.addEffect(allele, ct);
//    }

    public Iterable<String> getSampleNames(String studyId, String fileId) {
        VariantSourceEntry file = getSourceEntry(studyId, fileId);
        if (file == null) {
            return null;
        }
        return file.getSampleNames();
    }

    public void transformToEnsemblFormat() {
        if (getType() == VariantType.INDEL || getType() == VariantType.SV || getLength() > 1) {
            if (getReference().charAt(0) == getAlternate().charAt(0)) {
                setReference(getReference().substring(1));
                setAlternate(getAlternate().substring(1));
                setStart(getStart() + 1);
                if (getReference().length() < getAlternate().length()) {
                    setEnd(getEnd() - 1);
                }

                if (getReference().equals("")) {
                    setReference("-");
                }
                if (getAlternate().equals("")) {
                    setAlternate("-");
                }

                resetLength();
            }
        }
    }


    @Override
    public String toString() {
        if(this.getReference() == null) {
            return getChromosome() + ":" + getStart() + ":" + getAlternate();
        }else {
            return getChromosome() + ":" + getStart() + ":" + getReference() + ":" + getAlternate();
        }
    }

    public String toJson() {
        return impl.toString();
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Variant)) {
            return false;
        }

        Variant variant = (Variant) o;

        if (!Objects.equals(getStart(), variant.getStart())) {
            return false;
        }
        if (!Objects.equals(getEnd(), variant.getEnd())) {
            return false;
        }
        if (getChromosome() != null ? !getChromosome().equals(variant.getChromosome()) : variant.getChromosome() != null) {
            return false;
        }
        if (getReference() != null ? !getReference().equals(variant.getReference()) : variant.getReference() != null) {
            return false;
        }
        if (getAlternate() != null ? !getAlternate().equals(variant.getAlternate()) : variant.getAlternate() != null) {
            return false;
        }
        return getType() == variant.getType();

    }


//    //    public int hashCode() {
//        int result = getChromosome() != null ? getChromosome().hashCode() : 0;
//        result = 31 * result + getStart();
//        result = 31 * result + getEnd();
//        result = 31 * result + (getReference() != null ? getReference().hashCode() : 0);
//        result = 31 * result + (getAlternate() != null ? getAlternate().hashCode() : 0);
//        result = 31 * result + (getType() != null ? getType().hashCode() : 0);
//        return result;
//    }

    private String composeId(String studyId) {
        return composeId(studyId, null);
    }

    @Deprecated
    private String composeId(String studyId, String fileId) {
        return studyId;
    }

    public static Variant parseVariant(String variantString) {
        return new Variant(variantString);
    }

    public static List<Variant> parseVariants(String variantsString) {
        List<Variant> variants = null;
        if(variantsString != null && !variantsString.isEmpty()) {
            String[] variantItems = variantsString.split(",");
            variants = new ArrayList<>(variantItems.length);
            for(String variantString: variantItems) {
                variants.add(new Variant(variantString));
            }
        }
        return variants;
    }

}

