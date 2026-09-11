public class TravelPackage {
    private String destination;
    private String hotel;
    private String transport;
    private int days;
    private boolean mealsIncluded;

    public TravelPackage(){}

   public void setDestination(String destination){
        this.destination = destination;
   }
   public void setHotel(String hotel){
        this.hotel = hotel;
   }
    public void setTransport(String transport){
        this.transport = transport;
    }
    public void setDays(int days){
        this.days = days;
    }
    public void setMealsIncluded(boolean mealsIncluded){
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
    @Override
    public String toString(){
        return "TravelPackage{" + "destination='" + destination + '\'' + ", hotel= '" + hotel + '\'' + " , transport='" + transport + '\'' + ", days=" + days + ", mealsIncluded=" + mealsIncluded + '}';
    }
}
