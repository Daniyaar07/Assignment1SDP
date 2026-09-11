public class TravelPackage {
    private String destination;
    private String hotel;
    private String transport;
    private int days;
    private boolean mealsIncluded;

    public TravelPackage(String destination, String hotel , String transport , int days , boolean mealsIncluded){
        this.destination = destination;
        this.hotel = hotel;
        this.transport = transport;
        this.days = days;
        this.mealsIncluded = mealsIncluded;
    }
}
