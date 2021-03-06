/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.nifi.controller.status.history;

import java.util.Date;

public interface GarbageCollectionStatus {
    /**
     * @return the name of the JVM memory manager that this status pertains to
     */
    String getMemoryManagerName();

    /**
     * @return timestamp of when the status was created
     */
    Date getTimestamp();

    /**
     * @return the number of times that garbage collection has occurred
     */
    long getCollectionCount();

    /**
     * @return the number of milliseconds spent performing garbage collection
     */
    long getCollectionMillis();
}
