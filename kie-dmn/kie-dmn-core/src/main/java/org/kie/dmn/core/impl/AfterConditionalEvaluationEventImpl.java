/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
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
package org.kie.dmn.core.impl;

import org.kie.dmn.api.core.EvaluatorResult;
import org.kie.dmn.api.core.event.AfterConditionalEvaluationEvent;

public class AfterConditionalEvaluationEventImpl implements AfterConditionalEvaluationEvent {

    private final String nodeName;
    private final String decisionName;
    private final EvaluatorResult evaluatorResult;
    private final String executedId;

    public AfterConditionalEvaluationEventImpl(String nodeName, String decisionName, EvaluatorResult evaluatorResult, String executedId) {
        this.nodeName = nodeName;
        this.decisionName = decisionName;
        this.evaluatorResult = evaluatorResult;
        this.executedId = executedId;
    }

    @Override
    public String getNodeName() {
        return nodeName;
    }

    @Override
    public String getDecisionName() {
        return decisionName;
    }

    @Override
    public EvaluatorResult getEvaluatorResultResult() {
        return evaluatorResult;
    }

    @Override
    public String getExecutedId() {
        return executedId;
    }
}
