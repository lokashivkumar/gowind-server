package com.gowind.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Ride {

    private UUID rideId;
    private int partySize;
    private boolean dynamicPricing;
    private int timeTaken;
    private Date bookingTime;
    private Date pickUpTime;
    private Date dropOffTime;
    private RideStatus rideStatus;
    private RideType rideType;
    private List<Route> route;

    public List<Route> getRoute() {
        return route;
    }

    public void setRoute(List<Route> route) {
        this.route = route;
    }

    public Ride() {
        this.rideId = UUID.randomUUID();
    }

    public Date getBookingTime() {
        return bookingTime;
    }

    public void setBookingTime(Date bookingTime) {
        this.bookingTime = bookingTime;
    }

    public Date getDropOffTime() {
        return dropOffTime;
    }

    public void setDropOffTime(Date dropOffTime) {
        this.dropOffTime = dropOffTime;
    }

    public boolean isDynamicPricing() {
        return dynamicPricing;
    }

    public void setDynamicPricing(boolean dynamicPricing) {
        this.dynamicPricing = dynamicPricing;
    }

    public int getPartySize() {
        return partySize;
    }

    public void setPartySize(int partySize) {
        this.partySize = partySize;
    }

    public Date getPickUpTime() {
        return pickUpTime;
    }

    public void setPickUpTime(Date pickUpTime) {
        this.pickUpTime = pickUpTime;
    }

    public UUID getRideId() {
        return rideId;
    }

    public RideStatus getRideStatus() {
        return rideStatus;
    }

    public void setRideStatus(RideStatus rideStatus) {
        this.rideStatus = rideStatus;
    }

    public RideType getRideType() {
        return rideType;
    }

    public void setRideType(RideType rideType) {
        this.rideType = rideType;
    }


    public int getTimeTaken() {
        return timeTaken;
    }

    public void setTimeTaken(int timeTaken) {
        this.timeTaken = timeTaken;
    }

    @Override
    public String toString() {
        return "Ride with id: " + this.getRideId() + " created at " + this.getBookingTime() +
                " and the approximate distance is : " +
                this.getRoute().get(0).distance +
                " time taken to complete the ride would approximately be " + this.getRoute().get(0).duration;

    }
}