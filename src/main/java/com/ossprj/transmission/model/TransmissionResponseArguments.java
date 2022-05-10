package com.ossprj.transmission.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class TransmissionResponseArguments {

    @JsonProperty("torrents")
    private List<Torrent> torrents;
}
