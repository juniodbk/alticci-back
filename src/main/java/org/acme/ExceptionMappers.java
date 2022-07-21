package org.acme;

import javax.ws.rs.core.Response;

import org.jboss.resteasy.reactive.RestResponse;
import org.jboss.resteasy.reactive.server.ServerExceptionMapper;

class ExceptionMappers {
    @ServerExceptionMapper
    public RestResponse<String> mapException(NumberFormatException x) {
        return RestResponse.status(Response.Status.BAD_REQUEST, "value in wrong format, use only integer numbers");
    }
}
