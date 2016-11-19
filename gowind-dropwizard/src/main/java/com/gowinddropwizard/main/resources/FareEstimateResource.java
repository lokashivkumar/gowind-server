package com.gowinddropwizard.main.resources;

import com.gowind.main.FareCalculator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/fare")
public class FareEstimateResource {

    private static final Logger LOGGER = LoggerFactory.getLogger(FareEstimateResource.class);
    private static final String TAG = FareEstimateResource.class.getSimpleName();

    @Path("/estimate")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response requestRide(@QueryParam("distance") int totalTripDistance, @QueryParam("duration") int totalTripDuration) {
        double fareEstimate = 0;
        LOGGER.info(TAG, totalTripDistance + " : " + totalTripDuration);
        if (totalTripDistance != 0 && totalTripDuration != 0) {
            FareCalculator fareCalculator = new FareCalculator(totalTripDistance, totalTripDuration);
            fareEstimate = fareCalculator.computeFareEstimate();
        }
        LOGGER.info(String.valueOf(fareEstimate));
        return Response.ok(fareEstimate).build();
    }
}
