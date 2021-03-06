/*
 * Copyright 2016 Apache Software Foundation.
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
package io.hops.streaming;


public class ContainerToDecreaseEventReceiver {

    public void createAndAddToQueue(String containerId, String NodeId, String httpAddress, int priority, long memSize,
      int virtualCores, int gpus, int version) {

      ContainerToDecreaseEvent event = new ContainerToDecreaseEvent(containerId, NodeId, httpAddress, priority, memSize,
          virtualCores, gpus, version);

  }
}
