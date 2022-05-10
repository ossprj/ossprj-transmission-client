package com.ossprj.transmission.facade;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ossprj.transmission.model.Torrent;
import com.ossprj.transmission.model.TransmissionRequest;
import com.ossprj.transmission.model.TransmissionResponse;
import org.apache.http.HttpResponse;
import org.apache.http.client.fluent.Request;
import org.apache.http.entity.ContentType;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.List;

import static com.ossprj.transmission.config.TorrentConfiguration.TORRENT_FIELDS;

public class ListTorrents {

    private final ObjectMapper objectMapper = new ObjectMapper();
    private final List<String> torrentFields;

    {
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    public ListTorrents() {
        torrentFields = TORRENT_FIELDS;
    }

    public ListTorrents(final List<String> torrentFields) {
        this.torrentFields = torrentFields;
    }

    public List<Torrent> perform(final String endpoint, final String sessionId) throws IOException {

        final TransmissionRequest transmissionRequest = new TransmissionRequest();
        transmissionRequest.setMethod("torrent-get");
        transmissionRequest.getArguments().put("fields", torrentFields);

        /*final TransmissionRequestArguments transmissionRequestArguments = new TransmissionRequestArguments();
        transmissionRequestArguments.setFields(TORRENT_FIELDS);*/

        //transmissionRequest.setArguments(transmissionRequestArguments);

        final HttpResponse listTorrents = Request.Post(endpoint)
                .addHeader("X-Transmission-Session-Id", sessionId)
                .bodyString(objectMapper.writeValueAsString(transmissionRequest), ContentType.APPLICATION_JSON)
                .execute().returnResponse();

        final String response = EntityUtils.toString(listTorrents.getEntity());
        //System.out.println(response);

        final TransmissionResponse transmissionResponse = objectMapper.readValue(response, TransmissionResponse.class);

        return transmissionResponse.getTransmissionResponseArguments().getTorrents();
    }

}
