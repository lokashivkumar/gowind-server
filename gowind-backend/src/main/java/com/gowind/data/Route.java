package com.gowind.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.gowind.util.LatLng;

import java.util.List;

@JsonIgnoreProperties
public class Route {

    public Route() {
    }

    /**
     * routes - array
     * bounds -
     * legs - array
     *  distance - object
     *  duration - object
     *  end_address - string
     *  end_location - lat long
     *  start_address - string
     *  start_location - latlong
     *  steps: array
     *      distance
     *      duration
     *      polyline - object
     *      travel_mode
     *      start_location
     *      end_location
     *      html_instructions
     * overview_polyline - object {
     *     points:
     * }
     * summary
     * warnings -
     * waypoint_order: array
     * status -
     */


    public Distance distance;
    public Duration duration;
    public String endAddress;
    public LatLng endLocation;
    public String startAddress;
    public LatLng startLocation;
    public List<LatLng> points;
}
