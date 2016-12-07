package com.gowinddropwizard.main.resources;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class DriverFinderResource {
    private static final Logger LOGGER = LoggerFactory.getLogger(DriverFinderResource.class);

    @Path("/estimate")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response findDriver() {
        LOGGER.info(String.valueOf("Found Driver"));
        return Response.ok("John Doe").build();
    }
}
