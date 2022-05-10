package com.ossprj.transmission.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class File {

    @JsonProperty("bytesCompleted")
    private Long bytesCompleted;

    @JsonProperty("length")
    private Long length;

    @JsonProperty("name")
    private String name;

}
