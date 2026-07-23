public class Main {

    public static void main(String[] args) {

        CarObservation car = new CarObservation(
                "ABC1234",
                "23/07/2026",
                "Private",
                94,
                false
        );

        TrafficSystem system = new TrafficSystem();

        TrafficFine fine = system.processCar(car);

        if (fine != null) {
            fine.printFine();
        } else {
            System.out.println("No violations.");
        }

        System.out.println("\n========================");
        System.out.println("All Issued Fines");
        System.out.println("========================");

        for (TrafficFine issuedFine : system.getAllFines()) {
            issuedFine.printFine();
            System.out.println();
        }

        System.out.println("========================");
        System.out.println("Violation Statistics");
        System.out.println("========================");

        for (String violation : system.getViolationStatistics().keySet()) {
            System.out.println(
                    violation + " : " +
                    system.getViolationStatistics().get(violation)
            );
        }

    }

}