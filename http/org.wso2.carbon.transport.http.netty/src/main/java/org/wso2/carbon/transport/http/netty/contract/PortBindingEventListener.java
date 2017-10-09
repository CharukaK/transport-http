/*
 * Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.transport.http.netty.contract;

/**
 * An event listener to listen to port binding/unbinding events.
 */
public interface PortBindingEventListener {

    /**
     * Trigger an onOpen event when a connector is successfully up and running.
     *
     * @param host The IP address of the host
     * @param port The port the connector is listening to
     */
    void onOpen(String host, int port);

    /**
     * Trigger an onClose event when a connector has successfully stopped.
     *
     * @param connector The server connector object which just stopped.
     */
    void onClose(ServerConnector connector);
}
