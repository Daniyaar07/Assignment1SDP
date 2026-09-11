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
    public String getDestination(){
        return destination;
    }
    public String getHotel(){
        return hotel;
    }
    public String getTransport(){
        return transport;
    }
    public int getDays(){
        return days;
    }
    public boolean isMealsIncluded(){
        return mealsIncluded;
    }
}
