package com.gowinddropwizard.main.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/gowind")
public class GowindBaseResource {

    @GET
    @Path("/test")
    @Produces(MediaType.APPLICATION_JSON)
    public Response test() {
        String response = "Test OK.";
        return Response.ok(response).build();
    }
}
