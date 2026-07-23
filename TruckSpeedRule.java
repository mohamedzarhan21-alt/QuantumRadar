public class TruckSpeedRule implements ViolationRule {

    @Override
    public Violation check(CarObservation car) {

        if (car.getCarType().equals("Truck")) {

            if (car.getSpeed() > 60) {

                return new Violation(
                        "Truck exceeded speed limit",
                        300
                );

            }

        }

        return null;
    }

}