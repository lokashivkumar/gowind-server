package com.gowinddropwizard.main;

import com.gowinddropwizard.main.healthchecks.GoWindHealthCheck;
import com.gowinddropwizard.main.resources.*;
import io.dropwizard.Application;
import io.dropwizard.Configuration;
import io.dropwizard.setup.Environment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GoWindApplication extends Application<Configuration> {

    public static final Logger logger = LoggerFactory.getLogger(GoWindApplication.class);

    public static void main(String[] args) throws Exception {
        new GoWindApplication().run(args);
    }

    @Override
    public String getName() {
        return "GoWind";
    }

    @Override
    public void run(Configuration configuration, Environment environment) throws Exception {
        environment.jersey().register(new GowindBaseResource());
        environment.jersey().register(new UserResource());
        environment.jersey().register(new RequestRideResource());
        environment.jersey().register(new FareEstimateResource());
        environment.jersey().register(new DriverFinderResource());

        final GoWindHealthCheck healthCheck =
                new GoWindHealthCheck();
        environment.healthChecks().register("test", healthCheck);
    }
}
