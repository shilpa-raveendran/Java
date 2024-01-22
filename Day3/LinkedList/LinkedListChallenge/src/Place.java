public class Place {

    private  String placeName;
    private int distance;

    public Place( String placeName, int distance) {
        this.placeName = placeName;
        this.distance = distance;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}
