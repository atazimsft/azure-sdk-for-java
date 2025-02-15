// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.security.fluent.SubAssessmentsClient;
import com.azure.resourcemanager.security.fluent.models.SecuritySubAssessmentInner;
import com.azure.resourcemanager.security.models.SecuritySubAssessment;
import com.azure.resourcemanager.security.models.SubAssessments;

public final class SubAssessmentsImpl implements SubAssessments {
    private static final ClientLogger LOGGER = new ClientLogger(SubAssessmentsImpl.class);

    private final SubAssessmentsClient innerClient;

    private final com.azure.resourcemanager.security.SecurityManager serviceManager;

    public SubAssessmentsImpl(
        SubAssessmentsClient innerClient, com.azure.resourcemanager.security.SecurityManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<SecuritySubAssessment> listAll(String scope) {
        PagedIterable<SecuritySubAssessmentInner> inner = this.serviceClient().listAll(scope);
        return Utils.mapPage(inner, inner1 -> new SecuritySubAssessmentImpl(inner1, this.manager()));
    }

    public PagedIterable<SecuritySubAssessment> listAll(String scope, Context context) {
        PagedIterable<SecuritySubAssessmentInner> inner = this.serviceClient().listAll(scope, context);
        return Utils.mapPage(inner, inner1 -> new SecuritySubAssessmentImpl(inner1, this.manager()));
    }

    public PagedIterable<SecuritySubAssessment> list(String scope, String assessmentName) {
        PagedIterable<SecuritySubAssessmentInner> inner = this.serviceClient().list(scope, assessmentName);
        return Utils.mapPage(inner, inner1 -> new SecuritySubAssessmentImpl(inner1, this.manager()));
    }

    public PagedIterable<SecuritySubAssessment> list(String scope, String assessmentName, Context context) {
        PagedIterable<SecuritySubAssessmentInner> inner = this.serviceClient().list(scope, assessmentName, context);
        return Utils.mapPage(inner, inner1 -> new SecuritySubAssessmentImpl(inner1, this.manager()));
    }

    public SecuritySubAssessment get(String scope, String assessmentName, String subAssessmentName) {
        SecuritySubAssessmentInner inner = this.serviceClient().get(scope, assessmentName, subAssessmentName);
        if (inner != null) {
            return new SecuritySubAssessmentImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<SecuritySubAssessment> getWithResponse(
        String scope, String assessmentName, String subAssessmentName, Context context) {
        Response<SecuritySubAssessmentInner> inner =
            this.serviceClient().getWithResponse(scope, assessmentName, subAssessmentName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new SecuritySubAssessmentImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private SubAssessmentsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.security.SecurityManager manager() {
        return this.serviceManager;
    }
}
