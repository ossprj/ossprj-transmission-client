package com.ossprj.transmission.facade;

import org.apache.http.HttpResponse;
import org.apache.http.client.fluent.Request;

import java.io.IOException;

public class GetSessionId {

    public String perform(final String endpoint) throws IOException {
        final HttpResponse getSessionId = Request.Get(endpoint).execute().returnResponse();
        final String sessionId = getSessionId.getHeaders("X-Transmission-Session-Id")[0].getValue();
        return sessionId;
    }

}
