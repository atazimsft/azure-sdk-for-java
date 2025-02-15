// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.AmazonS3CompatibleLocation;
import org.junit.jupiter.api.Test;

public final class AmazonS3CompatibleLocationTests {
    @Test
    public void testDeserialize() {
        AmazonS3CompatibleLocation model =
            BinaryData
                .fromString("{\"type\":\"AmazonS3CompatibleLocation\",\"\":{}}")
                .toObject(AmazonS3CompatibleLocation.class);
    }

    @Test
    public void testSerialize() {
        AmazonS3CompatibleLocation model = new AmazonS3CompatibleLocation();
        model = BinaryData.fromObject(model).toObject(AmazonS3CompatibleLocation.class);
    }
}
