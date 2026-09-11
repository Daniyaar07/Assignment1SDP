public class Main {
    public static void main(String[] args){
        TravelDirector director = new TravelDirector();
        TravelPackageBuilder budgetBuider = new BudgetTravelBuilder();
        TravelPackage budgetTrip = director.createBudgetTrip(budgetBuider);

        TravelPackageBuilder luxuryBuilder = new LuxuryTravelBuilder();
        TravelPackage luxuryTrip = director.createLuxuryTrip(luxuryBuilder);

        System.out.println("Budget travel:");
        System.out.println(budgetTrip);

        System.out.println();

        System.out.println("Luxury travel:");
        System.out.println(luxuryTrip);
    }
}
