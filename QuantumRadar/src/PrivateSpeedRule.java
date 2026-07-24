public class PrivateSpeedRule implements ViolationRule {

    @Override
    public Violation check(CarObservation car) {

        if (car.getCarType().equals("Private")) {

            if (car.getSpeed() > 80) {

                return new Violation(
                        "Private car exceeded speed limit",
                        300
                );

            }

        }

        return null;
    }
}