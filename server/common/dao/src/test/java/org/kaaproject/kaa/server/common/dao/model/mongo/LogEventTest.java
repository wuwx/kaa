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

package org.kaaproject.kaa.server.common.dao.model.mongo;

import org.kaaproject.kaa.server.common.dao.model.mongo.LogEvent;

import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;

import org.junit.Assert;
import org.junit.Test;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;

public class LogEventTest {

    private static final DBObject TEST_LOG_HEADER =  new BasicDBObject();
    private static final DBObject TEST_EVENT = new BasicDBObject();

    @Test
    public void basicLogEventTest() {
        LogEvent logEvent = new LogEvent();

        Assert.assertNull(logEvent.getEvent());

        logEvent.setHeader(TEST_LOG_HEADER);
        logEvent.setEvent(TEST_EVENT);

        Assert.assertEquals(TEST_LOG_HEADER, logEvent.getHeader());
        Assert.assertEquals(TEST_EVENT, logEvent.getEvent());
    }

    @Test
    public void hashCodeEqualsTest() {
        EqualsVerifier.forClass(LogEvent.class).suppress(Warning.NONFINAL_FIELDS).verify();
    }

}
