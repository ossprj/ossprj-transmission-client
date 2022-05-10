package com.ossprj.transmission.facade;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ossprj.transmission.model.TransmissionRequest;
import com.ossprj.transmission.model.TransmissionResponse;
import org.apache.http.HttpResponse;
import org.apache.http.client.fluent.Request;
import org.apache.http.entity.ContentType;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.List;

public class RemoveTorrents {

    final ObjectMapper objectMapper = new ObjectMapper();

    {
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    public TransmissionResponse perform(final String endpoint, final String sessionId, final List<String> ids) throws IOException {
        final TransmissionRequest transmissionRequest = new TransmissionRequest();
        transmissionRequest.setMethod("torrent-remove");
        transmissionRequest.getArguments().put("ids", ids);

        final HttpResponse listTorrents = Request.Post(endpoint)
                .addHeader("X-Transmission-Session-Id", sessionId)
                .bodyString(objectMapper.writeValueAsString(transmissionRequest), ContentType.APPLICATION_JSON)
                .execute().returnResponse();

        final String response = EntityUtils.toString(listTorrents.getEntity());

        final TransmissionResponse transmissionResponse = objectMapper.readValue(response, TransmissionResponse.class);
        return transmissionResponse;


    }

}
