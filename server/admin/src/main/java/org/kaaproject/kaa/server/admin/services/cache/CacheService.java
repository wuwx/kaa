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

package org.kaaproject.kaa.server.admin.services.cache;

import org.kaaproject.kaa.common.dto.admin.RecordKey;
import org.kaaproject.kaa.common.dto.admin.SdkKey;
import org.kaaproject.kaa.server.admin.shared.services.KaaAdminServiceException;
import org.kaaproject.kaa.server.common.thrift.gen.control.FileData;
import org.kaaproject.kaa.server.common.thrift.gen.control.Sdk;

public interface CacheService {

    Sdk getSdk(SdkKey key) throws KaaAdminServiceException;

    byte[] uploadedFile(String key, byte[] data);

    void removeUploadedFile(String key);

    FileData getRecordLibrary(RecordKey key) throws KaaAdminServiceException;

    FileData getRecordSchema(RecordKey key) throws KaaAdminServiceException;

}
