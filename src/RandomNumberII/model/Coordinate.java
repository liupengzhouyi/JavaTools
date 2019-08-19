package RandomNumberII.model;

public class Coordinate {

    private int Longitude ;

    private int Latitude ;

    public Coordinate(int longitude, int latitude) {
        Longitude = longitude;
        Latitude = latitude;
    }

    public Coordinate() {
    }

    public int getLongitude() {
        return Longitude;
    }

    public void setLongitude(int longitude) {
        Longitude = longitude;
    }

    public int getLatitude() {
        return Latitude;
    }

    public void setLatitude(int latitude) {
        Latitude = latitude;
    }

    @Override
    public String toString() {
        return "Coordinate{" +
                "Longitude=" + Longitude +
                ", Latitude=" + Latitude +
                '}';
    }
}
