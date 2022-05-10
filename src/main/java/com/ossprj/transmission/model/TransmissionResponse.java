package com.ossprj.transmission.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class TransmissionResponse {

    @JsonProperty("arguments")
    private TransmissionResponseArguments transmissionResponseArguments;

    @JsonProperty("result")
    private String result;

    @JsonProperty("tag")
    private String tag;

}
