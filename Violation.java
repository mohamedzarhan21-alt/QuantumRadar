public class Violation {

    private String description;
    private int fineAmount;



    // constructor
    public Violation(String description, int fineAmount) {
        this.description = description;
        this.fineAmount = fineAmount;
    }



    // getters 
    public String getDescription() {
        return description;
    }

    public int getFineAmount() {
        return fineAmount;
    }
}