package com.ossprj.transmission.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class TransmissionRequest {

    @JsonProperty("arguments")
    private Map<String,Object> arguments = new HashMap<>();

    @JsonProperty("method")
    private String method;

    @JsonProperty("tag")
    private String tag;
}
