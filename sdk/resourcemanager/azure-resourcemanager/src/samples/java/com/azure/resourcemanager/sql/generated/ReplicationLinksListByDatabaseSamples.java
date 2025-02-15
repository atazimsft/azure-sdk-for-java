// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

import com.azure.core.util.Context;

/** Samples for ReplicationLinks ListByDatabase. */
public final class ReplicationLinksListByDatabaseSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/stable/2014-04-01/examples/ReplicationLinkList.json
     */
    /**
     * Sample code: List Replication links.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listReplicationLinks(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getReplicationLinks()
            .listByDatabase("sqlcrudtest-4799", "sqlcrudtest-6440", "testdb", Context.NONE);
    }
}
