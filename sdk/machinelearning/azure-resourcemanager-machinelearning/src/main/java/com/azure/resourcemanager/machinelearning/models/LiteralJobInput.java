// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Literal input type. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "jobInputType")
@JsonTypeName("Literal")
@Fluent
public final class LiteralJobInput extends JobInput {
    /*
     * [Required] Literal value for the input.
     */
    @JsonProperty(value = "value", required = true)
    private String value;

    /**
     * Get the value property: [Required] Literal value for the input.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: [Required] Literal value for the input.
     *
     * @param value the value value to set.
     * @return the LiteralJobInput object itself.
     */
    public LiteralJobInput withValue(String value) {
        this.value = value;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public LiteralJobInput withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (value() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property value in model LiteralJobInput"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(LiteralJobInput.class);
}
