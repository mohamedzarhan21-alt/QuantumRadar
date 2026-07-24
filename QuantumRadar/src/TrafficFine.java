import java.util.List;

public class TrafficFine {

    private String plateNumber;
    private List<Violation> violations;

    public TrafficFine(String plateNumber, List<Violation> violations) {

        this.plateNumber = plateNumber;
        this.violations = violations;

    }

    public int getTotalAmount() {

        int total = 0;

        for (Violation violation : violations) {

            total += violation.getFineAmount();

        }

        return total;

    }

    public void printFine() {

        System.out.println("Traffic Fine");
        System.out.println("Car: " + plateNumber);
        System.out.println("Total Amount: " + getTotalAmount() + " EGP");
        System.out.println("Violations:");

        for (Violation violation : violations) {

            System.out.println(
                    "- "
                    + violation.getDescription()
                    + " : "
                    + violation.getFineAmount()
                    + " EGP"
            );

        }

    }

    
    public List<Violation> getViolations() {
        return violations;
    }

}