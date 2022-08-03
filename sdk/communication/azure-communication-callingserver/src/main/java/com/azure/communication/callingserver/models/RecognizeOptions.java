// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.communication.callingserver.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/** Optioanl elemens for Recognize **/
public class RecognizeOptions {
    /*
     * Determines the type of the recognition.
     */
    @JsonProperty(value = "recognizeInputType")
    private RecognizeInputType recognizeInputType;

    /*
     * The source of the audio to be played for recognition.
     */
    @JsonProperty(value = "playSourceInfo")
    private PlaySource playSourceInfo;

    /*
     * If set recognize can barge into other existing
     * queued-up/currently-processing requests.
     */
    @JsonProperty(value = "stopCurrentOperations")
    private Boolean stopCurrentOperations;

    /*
     * The value to identify context of the operation.
     */
    @JsonProperty(value = "operationContext")
    private String operationContext;

    /**
     * Get the recognizeInputType property: Determines the type of the recognition.
     *
     * @return the recognizeInputType value.
     */
    public RecognizeInputType getRecognizeInputType() {
        return this.recognizeInputType;
    }

    /**
     * Set the recognizeInputType property: Determines the type of the recognition.
     *
     * @param recognizeInputType the recognizeInputType value to set.
     * @return the RecognizeRequest object itself.
     */
    public RecognizeOptions setRecognizeInputType(RecognizeInputType recognizeInputType) {
        this.recognizeInputType = recognizeInputType;
        return this;
    }

    /**
     * Get the playSourceInfo property: The source of the audio to be played for recognition.
     *
     * @return the playSourceInfo value.
     */
    public PlaySource getPlaySourceInfo() {
        return this.playSourceInfo;
    }

    /**
     * Set the playSourceInfo property: The source of the audio to be played for recognition.
     *
     * @param playSourceInfo the playSourceInfo value to set.
     * @return the RecognizeRequest object itself.
     */
    public RecognizeOptions setPlaySourceInfo(PlaySource playSourceInfo) {
        this.playSourceInfo = playSourceInfo;
        return this;
    }

    /**
     * Get the stopCurrentOperations property: If set recognize can barge into other existing
     * queued-up/currently-processing requests.
     *
     * @return the stopCurrentOperations value.
     */
    public Boolean isStopCurrentOperations() {
        return this.stopCurrentOperations;
    }

    /**
     * Set the stopCurrentOperations property: If set recognize can barge into other existing
     * queued-up/currently-processing requests.
     *
     * @param stopCurrentOperations the stopCurrentOperations value to set.
     * @return the RecognizeRequest object itself.
     */
    public RecognizeOptions setStopCurrentOperations(Boolean stopCurrentOperations) {
        this.stopCurrentOperations = stopCurrentOperations;
        return this;
    }

    /**
     * Get the operationContext property: The value to identify context of the operation.
     *
     * @return the operationContext value.
     */
    public String getOperationContext() {
        return this.operationContext;
    }

    /**
     * Set the operationContext property: The value to identify context of the operation.
     *
     * @param operationContext the operationContext value to set.
     * @return the RecognizeRequest object itself.
     */
    public RecognizeOptions setOperationContext(String operationContext) {
        this.operationContext = operationContext;
        return this;
    }
}
