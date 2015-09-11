package org.opencb.biodata.models.variant.avro;

import junit.framework.TestCase;


import java.util.*;

/**
 * Created by kalyan
 */
public class VariantContextToVariantConverterTest extends TestCase {

    protected String stringValue1;
    protected String stringValue2;
    protected String AlternateAllel;
    protected String vcffilepath;
    protected String avroOutPutFilePath;
    protected String tbiFilePath;
    VariantContextToVariantConverter variantContextToVariantConverter=new VariantContextToVariantConverter();

    public void setUp() throws Exception {
        stringValue1="a:b:c:d:e";
        stringValue2="1:2:3:4:5";
        AlternateAllel="a,b,c,d ";
        vcffilepath="/home/vcfInput/example.vcf.gz";
        tbiFilePath="/home/vcfInput/example.vcf.gz.tbi";
        avroOutPutFilePath= "/home/VCFOutput/vcf_out_2808.avro";



    }

    public void tearDown() throws Exception {

    }

    public void testReadVCFFile() throws Exception {
        VariantContextToVariantConverter variantContextToVariantConverter=new VariantContextToVariantConverter();
        variantContextToVariantConverter.readVCFFile(vcffilepath,tbiFilePath,avroOutPutFilePath);
    }

    public void testGetSampleDataMap() throws Exception {
        Map<CharSequence, CharSequence> expectedMap = new HashMap<>();
        Map<CharSequence, CharSequence> actualMap = new HashMap<>();
        expectedMap.put("a", "1");
        expectedMap.put("b", "2");
        expectedMap.put("c", "3");
        expectedMap.put("d", "4");
        expectedMap.put("e", "5");
        actualMap = VariantContextToVariantConverter.getSampleDataMap(stringValue1, stringValue2);
        assertEquals(expectedMap.size(), actualMap.size());
        for (Map.Entry<CharSequence, CharSequence> value : expectedMap.entrySet()) {
            CharSequence actualValue = actualMap.get(value.getKey());
            assertNotNull(actualValue);
            assertEquals(value.getValue(), actualValue);
        }
    }



    public void testGetAlternateAllele() throws Exception {

        CharSequence expectedAlternateAllele="a";
        CharSequence actualAlternateAllele = VariantContextToVariantConverter.getAlternateAllele(AlternateAllel);
        System.out.println("actualAlternateAllele" + actualAlternateAllele);
        assertEquals(expectedAlternateAllele, actualAlternateAllele);

    }

    public void testGetSecondaryAlternateAllele() throws Exception {
        List<CharSequence> expectedAlternateAlleleList=new ArrayList<>();
        expectedAlternateAlleleList.add("b");
        expectedAlternateAlleleList.add("c");
        expectedAlternateAlleleList.add("d");
        List<CharSequence> actualAlternateAllele =new ArrayList<>();
        actualAlternateAllele=VariantContextToVariantConverter.getSecondaryAlternateAllele(AlternateAllel);
        assertEquals(expectedAlternateAlleleList.size(), actualAlternateAllele.size());
        assertEquals(new HashSet(expectedAlternateAlleleList), new HashSet(actualAlternateAllele));


    }

     public void testGetEnumFromString() throws Exception {
        VariantType actualVariantType;
        actualVariantType=VariantContextToVariantConverter.getEnumFromString(
                org.opencb.biodata.models.variant.avro.VariantType.class, "SNP");
        assertTrue(actualVariantType instanceof VariantType);


    }


}