package com.gowind.main;

import javax.annotation.Nonnegative;
import javax.annotation.Nonnull;

public class FareCalculator {

    @Nonnull
    @Nonnegative
    private static int multiplier = 1;
    @Nonnull
    @Nonnegative
    private static int distance;
    @Nonnull
    @Nonnegative
    private static int duration;
    @Nonnull
    @Nonnegative
    private static int costPerKilometer;
    @Nonnull
    @Nonnegative
    private static double costPerMinute;
    @Nonnull
    @Nonnegative
    private static int approximator; //approximates wait time/ stop time.

    public FareCalculator(int distance, int duration) {
        this.duration = duration;
        this.distance = distance;
    }

    public double computeFareEstimate() {
        costPerKilometer = 7;
        int baseFare = 5;
        costPerMinute = 0.15;
        return (baseFare + (costPerMinute * duration) + (costPerKilometer * distance) + approximator);
    }

    public double computeTotalFare() {
        @Nonnull
        @Nonnegative
        int waitTimeDuringRide = 1;
        @Nonnull
        @Nonnegative
        int baseFare = 5;
        return (baseFare + (costPerMinute * duration) + (costPerKilometer * distance) + multiplier);
    }
}
