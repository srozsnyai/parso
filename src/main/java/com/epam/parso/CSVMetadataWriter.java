/**
 * *************************************************************************
 * Copyright (C) 2015 EPAM
 * <p>
 * This file is part of Parso.
 * <p>
 * This file may be distributed and/or modified under the terms of the
 * GNU General Public License version 3 as published by the Free Software
 * Foundation and appearing in the file LICENSE.GPL included in the
 * packaging of this file.
 * <p>
 * This file is provided AS IS with NO WARRANTY OF ANY KIND, INCLUDING THE
 * WARRANTY OF DESIGN, MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE.
 * *************************************************************************
 */

package com.epam.parso;

import java.io.IOException;
import java.util.List;

/**
 * Interface for exporting metadata from sas7bdat file to csv.
 */
public interface CSVMetadataWriter {
    /**
     * The method to export a parsed sas7bdat file metadata using writer.
     *
     * @param columns the {@link Column} class variables list that stores columns description from the sas7bdat file.
     * @throws java.io.IOException appears if the output into writer is impossible.
     */
    void writeMetadata(List<Column> columns) throws IOException;

    /**
     * The method to output the sas7bdat file properties.
     *
     * @param sasFileProperties the variable with sas file properties data.
     * @throws IOException appears if the output into writer is impossible.
     */
    void writeSasFileProperties(SasFileProperties sasFileProperties) throws IOException;
}
