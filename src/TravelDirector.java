public class TravelDirector {
    public TravelPackage createBudgetTrip(TravelPackageBuilder builder){
        return builder .setDestination("Almaty") .setHotel("3-star hotel") .setTransport("Bus") .setDays(3) .setMealsIncluded(false) .build();
    }
    public TravelPackage createLuxuryTrip(TravelPackageBuilder builder){
        return builder .setDestination("Dubai") .setHotel("5-star hotel") .setTransport("Business class flight") .setDays(7) .setMealsIncluded(true) .build();
     }
}
