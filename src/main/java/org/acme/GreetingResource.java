package org.acme;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class GreetingResource {

    @Inject
    protected AlticciCalcService service;

    @GET
    @Path("/alticci/{value}")
    @Produces(MediaType.TEXT_PLAIN)
    public Integer alticci(@PathParam("value") String value) {
        var n = Integer.parseInt(value);

        return service.calc(n);
    }
}