// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.fluent.models.RevisionInner;
import com.azure.resourcemanager.appcontainers.models.RevisionCollection;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

public final class RevisionCollectionTests {
    @Test
    public void testDeserialize() {
        RevisionCollection model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"createdTime\":\"2021-01-15T08:47:59Z\",\"lastActiveTime\":\"2021-05-14T06:41:01Z\",\"fqdn\":\"jabibsystawf\",\"active\":true,\"replicas\":591359047,\"trafficWeight\":226758731,\"provisioningError\":\"jxbkzbzkdvn\",\"healthState\":\"Healthy\",\"provisioningState\":\"Deprovisioned\"},\"id\":\"urgkakmokzhjjk\",\"name\":\"ffhmouwqlgzr\",\"type\":\"zeeyebi\"},{\"properties\":{\"createdTime\":\"2021-08-01T17:17:52Z\",\"lastActiveTime\":\"2021-02-02T12:35:30Z\",\"fqdn\":\"lbjbsyb\",\"active\":false,\"replicas\":146564330,\"trafficWeight\":1583288095,\"provisioningError\":\"mfpgv\",\"healthState\":\"None\",\"provisioningState\":\"Failed\"},\"id\":\"ltha\",\"name\":\"fxssm\",\"type\":\"u\"},{\"properties\":{\"createdTime\":\"2021-10-23T07:29:01Z\",\"lastActiveTime\":\"2021-01-02T11:55:22Z\",\"fqdn\":\"zpdrhneu\",\"active\":false,\"replicas\":150720980,\"trafficWeight\":2008248365,\"provisioningError\":\"i\",\"healthState\":\"None\",\"provisioningState\":\"Deprovisioned\"},\"id\":\"gpikpzimejza\",\"name\":\"lfzxiavrmbzonoki\",\"type\":\"rjqc\"}],\"nextLink\":\"gzpfrla\"}")
                .toObject(RevisionCollection.class);
    }

    @Test
    public void testSerialize() {
        RevisionCollection model =
            new RevisionCollection()
                .withValue(Arrays.asList(new RevisionInner(), new RevisionInner(), new RevisionInner()));
        model = BinaryData.fromObject(model).toObject(RevisionCollection.class);
    }
}
