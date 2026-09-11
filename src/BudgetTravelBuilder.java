public class BudgetTravelBuilder implements TravelPackageBuilder{
    private TravelPackage travelPackage = new TravelPackage();

    @Override
    public TravelPackageBuilder setDestination(String destination){
        travelPackage.setDestination(destination);
        return this;
    }

    @Override
    public TravelPackageBuilder setHotel(String hotel){
        travelPackage.setHotel(hotel);
        return this;
    }

    @Override
    public TravelPackageBuilder setTransport(String transport){
        travelPackage.setTransport(transport);
        return this;
    }

    @Override
    public TravelPackageBuilder setDays(int days){
        travelPackage.setDays(days);
        return this;
    }

    @Override
    public TravelPackageBuilder setMealsIncluded(boolean mealsIncluded){
        travelPackage.setMealsIncluded(mealsIncluded);
        return this;
    }

    @Override
    public TravelPackage build(){
        return travelPackage;
    }
}