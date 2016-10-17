package com.gowinddropwizard.main.resources;

import com.google.gson.Gson;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/request")
public class RequestRideResource {
    @Path("/test")
    @GET
    public Response testRide() {
        Gson gson = new Gson();
        String response = gson.toJson("Ride Ok");
        return Response.ok(response).build();
    }
}
