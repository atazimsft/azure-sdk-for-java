package com.azure.communication.callingserver.implementation.models;

import com.azure.communication.callingserver.models.DtmfOptions;
import com.fasterxml.jackson.annotation.JsonProperty;

public class RecognizeOptionsInternal {
    /*
     * Determines if we pause the prompt and start recognizing.
     */
    @JsonProperty(value = "pausePlayOnResponse")
    private Boolean pausePlayOnResponse;

    /*
     * Time to wait for first input after prompt (if any) plays.
     */
    @JsonProperty(value = "initialSilenceTimeoutInSeconds")
    private Integer initialSilenceTimeoutInSeconds;

    /*
     * Defines options for DTMF.
     */
    @JsonProperty(value = "dtmfOptions")
    private DtmfOptions dtmfOptions;

    /**
     * Get the pausePlayOnResponse property: Determines if we pause the prompt and start recognizing.
     *
     * @return the pausePlayOnResponse value.
     */
    public Boolean isPausePlayOnResponse() {
        return this.pausePlayOnResponse;
    }

    /**
     * Set the pausePlayOnResponse property: Determines if we pause the prompt and start recognizing.
     *
     * @param pausePlayOnResponse the pausePlayOnResponse value to set.
     * @return the RecognizeOptions object itself.
     */
    public RecognizeOptionsInternal setPausePlayOnResponse(Boolean pausePlayOnResponse) {
        this.pausePlayOnResponse = pausePlayOnResponse;
        return this;
    }

    /**
     * Get the initialSilenceTimeoutInSeconds property: Time to wait for first input after prompt (if any) plays.
     *
     * @return the initialSilenceTimeoutInSeconds value.
     */
    public Integer getInitialSilenceTimeoutInSeconds() {
        return this.initialSilenceTimeoutInSeconds;
    }

    /**
     * Set the initialSilenceTimeoutInSeconds property: Time to wait for first input after prompt (if any) plays.
     *
     * @param initialSilenceTimeoutInSeconds the initialSilenceTimeoutInSeconds value to set.
     * @return the RecognizeOptions object itself.
     */
    public RecognizeOptionsInternal setInitialSilenceTimeoutInSeconds(Integer initialSilenceTimeoutInSeconds) {
        this.initialSilenceTimeoutInSeconds = initialSilenceTimeoutInSeconds;
        return this;
    }

    /**
     * Get the dtmfOptions property: Defines options for DTMF.
     *
     * @return the dtmfOptions value.
     */
    public DtmfOptions getDtmfOptions() {
        return this.dtmfOptions;
    }

    /**
     * Set the dtmfOptions property: Defines options for DTMF.
     *
     * @param dtmfOptions the dtmfOptions value to set.
     * @return the RecognizeOptions object itself.
     */
    public RecognizeOptionsInternal setDtmfOptions(DtmfOptions dtmfOptions) {
        this.dtmfOptions = dtmfOptions;
        return this;
    }
}
