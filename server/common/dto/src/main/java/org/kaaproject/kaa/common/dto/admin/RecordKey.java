/*
 * Copyright 2014 CyberVision, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.kaaproject.kaa.common.dto.admin;

import java.io.Serializable;

public class RecordKey implements Serializable {

    private static final long serialVersionUID = -5453653699078782999L;

    public static final String RECORD_KEY_PARAMETER = "recordKey";

    private String applicationId;
    private int logSchemaVersion;
    private RecordFiles recordFiles;

    public RecordKey() {
    }

    public RecordKey(String applicationId, int logSchemaVersion, RecordFiles recordFiles) {
        this.applicationId = applicationId;
        this.logSchemaVersion = logSchemaVersion;
        this.recordFiles = recordFiles;
    }

    public RecordKey(String applicationId, int logSchemaVersion) {
        this.applicationId = applicationId;
        this.logSchemaVersion = logSchemaVersion;
        this.recordFiles = RecordFiles.LIBRARY;
    }

    public static enum RecordFiles {
        SCHEMA, LIBRARY;
    }

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public int getLogSchemaVersion() {
        return logSchemaVersion;
    }

    public void setLogSchemaVersion(int logSchemaVersion) {
        this.logSchemaVersion = logSchemaVersion;
    }

    public RecordFiles getRecordFiles() {
        return recordFiles;
    }

    public void setRecordFiles(RecordFiles recordFiles) {
        this.recordFiles = recordFiles;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((applicationId == null) ? 0 : applicationId.hashCode());
        result = prime * result + logSchemaVersion;
        result = prime * result + ((recordFiles == null) ? 0 : recordFiles.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        RecordKey other = (RecordKey) obj;
        if (applicationId == null) {
            if (other.applicationId != null)
                return false;
        } else if (!applicationId.equals(other.applicationId))
            return false;
        if (logSchemaVersion != other.logSchemaVersion)
            return false;
        if (recordFiles != other.recordFiles)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "RecordKey [applicationId=" + applicationId + ", logSchemaVersion=" + logSchemaVersion + ", recordFiles=" + recordFiles + "]";
    }

}
