package com.gowind.util;

public final class LatLng {
    private final int mVersionCode;
    public final double latitude;
    public final double longitude;

    public LatLng() {
        longitude = 0;
        latitude = 0;
        mVersionCode = 0;
    }

    public LatLng(int versionCode, double latitude, double longitude) {
        this.mVersionCode = versionCode;
        if(-180.0D <= longitude && longitude < 180.0D) {
            this.longitude = longitude;
        } else {
            this.longitude = ((longitude - 180.0D) % 360.0D + 360.0D) % 360.0D - 180.0D;
        }

        this.latitude = Math.max(-90.0D, Math.min(90.0D, latitude));
    }

    public LatLng(double latitude, double var3) {
        this(1, latitude, var3);
    }

    int getVersionCode() {
        return this.mVersionCode;
    }


    public int hashCode() {
        long latInLong = Double.doubleToLongBits(this.latitude);
        int latHashCode = 31 + (int)(latInLong ^ latInLong >>> 32);
        latInLong = Double.doubleToLongBits(this.longitude);
        latHashCode = 31 * latHashCode + (int)(latInLong ^ latInLong >>> 32);
        return latHashCode;
    }

    public boolean equals(Object inputObject) {
        if(this == inputObject) {
            return true;
        } else if(!(inputObject instanceof LatLng)) {
            return false;
        } else {
            LatLng inputLatLng = (LatLng)inputObject;
            return Double.doubleToLongBits(this.latitude) == Double.doubleToLongBits(inputLatLng.latitude) && Double.doubleToLongBits(this.longitude) == Double.doubleToLongBits(inputLatLng.longitude);
        }
    }

    public String toString() {
        double latDouble = this.latitude;
        double lngDouble = this.longitude;
        return (new StringBuilder(60)).append("lat/lng: (").append(latDouble).append(",").append(lngDouble).append(")").toString();
    }
}

