public class LuxuryTravelBuilder implements TravelPackageBuilder{
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
}
