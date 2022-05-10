package com.ossprj.transmission.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class FileStats {

    @JsonProperty("bytesCompleted")
    private Long bytesCompleted;

    @JsonProperty("priority")
    private Integer priority;

    @JsonProperty("wanted")
    private Boolean wanted;

}
