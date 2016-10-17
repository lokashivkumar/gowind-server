package com.gowinddropwizard.main.resources;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.Gson;
import com.gowind.data.UserDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/user")
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserResource {

    private static final Logger logger = LoggerFactory.getLogger(UserResource.class);
    private static final String LOGTAG = UserResource.class.getSimpleName();
    private UserDto userData;

    @Path("/getuser")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getUser(@QueryParam("username") String userName) {
        System.out.println(userName);
        logger.info(LOGTAG, userName);
        userData = new UserDto();
        userData.setUserName(userName);
        userData.setEmail("user1@test.com");
        userData.setPhoneNumber("408-777-7777");
        userData.setRating(5);
        if (userName.equalsIgnoreCase("user1")) {
            return Response.ok(userData).build();
        }
        return null;
    }

    @Path("/test")
    @GET
    public Response testUser() {
        Gson gson = new Gson();
        String response = gson.toJson("User Ok");
        return Response.ok(response).build();
    }

    @Path("/saveUser")
    @POST
    public Response saveUser(@PathParam("username") String username) {

        return Response.ok("saved").build();
    }
}
