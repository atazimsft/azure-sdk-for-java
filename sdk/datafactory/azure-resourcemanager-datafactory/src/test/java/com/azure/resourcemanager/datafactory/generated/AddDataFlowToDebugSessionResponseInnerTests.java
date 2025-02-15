// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.AddDataFlowToDebugSessionResponseInner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AddDataFlowToDebugSessionResponseInnerTests {
    @Test
    public void testDeserialize() {
        AddDataFlowToDebugSessionResponseInner model =
            BinaryData
                .fromString("{\"jobVersion\":\"iibfggj\"}")
                .toObject(AddDataFlowToDebugSessionResponseInner.class);
        Assertions.assertEquals("iibfggj", model.jobVersion());
    }

    @Test
    public void testSerialize() {
        AddDataFlowToDebugSessionResponseInner model =
            new AddDataFlowToDebugSessionResponseInner().withJobVersion("iibfggj");
        model = BinaryData.fromObject(model).toObject(AddDataFlowToDebugSessionResponseInner.class);
        Assertions.assertEquals("iibfggj", model.jobVersion());
    }
}
