public interface TravelPackageBuilder {
    TravelPackageBuilder setDestination(String destination);
    TravelPackageBuilder setHotel(String hotel);
    TravelPackageBuilder setTransport(String transport);
    TravelPackageBuilder setDays(int days);
    TravelPackageBuilder setMealsIncluded(boolean mealsIncluded);
    TravelPackage build();
}
