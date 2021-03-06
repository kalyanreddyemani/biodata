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

package org.opencb.biodata.formats.variant.vcf4.io;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;
import org.opencb.biodata.formats.variant.vcf4.VcfRecord;
import org.opencb.commons.io.DataWriter;

/**
 * 
 * @author Alejandro Aleman Ramos &lt;aaleman@cipf.es&gt;
 * @author Cristina Yenyxe Gonzalez Garcia &lt;cyenyxe@ebi.ac.uk&gt;
 */
public class VcfRawWriter implements DataWriter<VcfRecord> {

    private VcfRawReader reader;
    private PrintWriter printer;
    private String filename;


    public VcfRawWriter(VcfRawReader reader, String filename) {
        this.reader = reader;
        this.filename = filename;
    }

    @Override
    public boolean open() {
        boolean res = true;
        try {
            printer = new PrintWriter(filename);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            res = false;
        }

        return res;
    }

    @Override
    public boolean close() {
        printer.close();
        return true;
    }

    @Override
    public boolean pre() {
        printer.append(reader.getHeader());
        return true;
    }

    @Override
    public boolean post() {
        return true;
    }

    @Override
    public boolean write(VcfRecord elem) {
        return write(Arrays.asList(elem));
    }

    @Override
    public boolean write(List<VcfRecord> batch) {
        for (VcfRecord record : batch) {
            printer.append(record.toString()).append("\n");
        }
        return true;
    }
    
}
