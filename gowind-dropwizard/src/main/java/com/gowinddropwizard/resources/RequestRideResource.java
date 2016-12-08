package com.gowinddropwizard.resources;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.gowind.data.Ride;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;

@Path("/ride")
public class RequestRideResource {

    private static final Logger LOGGER = LoggerFactory.getLogger(RequestRideResource.class);

    @Path("/test")
    @GET
    public Response testRide() {
        return Response.ok("OK").build();
    }

    //TODO : Use Jackson instead of GSON For object mapping.
    //TODO : Use Guava for Optional returns

    @Path("/request")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response requestRide(String rideRequestJson) {
        Ride currentRide = null;
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            currentRide = objectMapper.reader().forType(Ride.class).readValue(rideRequestJson);
        } catch (IOException e) {
            e.printStackTrace();
        }
        LOGGER.info(currentRide.toString());
        return Response.ok("OK").build();
    }

    @Path("update")
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateRide() {
        return Response.ok("Updated successfully").build();
    }
}
