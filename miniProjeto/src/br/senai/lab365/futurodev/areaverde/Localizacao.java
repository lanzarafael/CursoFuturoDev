package br.senai.lab365.futurodev.areaverde;

public class Localizacao {
    private double latitude;
    private double longitude;
    private int areaVerdeId;

    public Localizacao(double latitude, double longitude, int areaVerdeId) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.areaVerdeId = areaVerdeId;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public int getAreaVerdeId() {
        return areaVerdeId;
    }

    @Override
    public String toString() {
        return "Latitude: " + latitude + ", Longitude: " + longitude;
    }
}
