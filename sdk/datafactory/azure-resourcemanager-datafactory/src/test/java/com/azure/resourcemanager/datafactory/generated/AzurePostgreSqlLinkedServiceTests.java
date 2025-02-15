// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.AzureKeyVaultSecretReference;
import com.azure.resourcemanager.datafactory.models.AzurePostgreSqlLinkedService;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AzurePostgreSqlLinkedServiceTests {
    @Test
    public void testDeserialize() {
        AzurePostgreSqlLinkedService model =
            BinaryData
                .fromString(
                    "{\"type\":\"AzurePostgreSql\",\"typeProperties\":{\"password\":{\"type\":\"AzureKeyVaultSecret\"}},\"connectVia\":{\"referenceName\":\"u\",\"parameters\":{}},\"description\":\"dwmf\",\"parameters\":{\"vjqdvdwkq\":{\"type\":\"String\"},\"rlefgnaavu\":{\"type\":\"Int\"},\"tetaoutnpdctuhs\":{\"type\":\"Bool\"},\"fyihduyeuyldp\":{\"type\":\"Object\"}},\"annotations\":[],\"\":{}}")
                .toObject(AzurePostgreSqlLinkedService.class);
        Assertions.assertEquals("u", model.connectVia().referenceName());
        Assertions.assertEquals("dwmf", model.description());
        Assertions.assertEquals(ParameterType.STRING, model.parameters().get("vjqdvdwkq").type());
    }

    @Test
    public void testSerialize() {
        AzurePostgreSqlLinkedService model =
            new AzurePostgreSqlLinkedService()
                .withConnectVia(new IntegrationRuntimeReference().withReferenceName("u").withParameters(mapOf()))
                .withDescription("dwmf")
                .withParameters(
                    mapOf(
                        "vjqdvdwkq",
                        new ParameterSpecification().withType(ParameterType.STRING),
                        "rlefgnaavu",
                        new ParameterSpecification().withType(ParameterType.INT),
                        "tetaoutnpdctuhs",
                        new ParameterSpecification().withType(ParameterType.BOOL),
                        "fyihduyeuyldp",
                        new ParameterSpecification().withType(ParameterType.OBJECT)))
                .withAnnotations(Arrays.asList())
                .withPassword(new AzureKeyVaultSecretReference());
        model = BinaryData.fromObject(model).toObject(AzurePostgreSqlLinkedService.class);
        Assertions.assertEquals("u", model.connectVia().referenceName());
        Assertions.assertEquals("dwmf", model.description());
        Assertions.assertEquals(ParameterType.STRING, model.parameters().get("vjqdvdwkq").type());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
