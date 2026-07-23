public class CarObservation {

    private String plateNumber;
    private String date;
    private String carType;
    private int speed;
    private boolean seatbeltFastened;




    // constructor  
    public CarObservation(String plateNumber, String date, String carType, int speed, boolean seatbeltFastened) {
        this.plateNumber = plateNumber;
        this.date = date;
        this.carType = carType;
        this.speed = speed;
        this.seatbeltFastened = seatbeltFastened;
    }



    // getter methods
    public String getPlateNumber() {
        return plateNumber;
    }

    public String getDate() {
        return date;
    }

    public String getCarType() {
        return carType;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isSeatbeltFastened() {
        return seatbeltFastened;
    }


}