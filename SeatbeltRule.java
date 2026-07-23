public class SeatbeltRule implements ViolationRule {

    @Override
    public Violation check(CarObservation car) {

        if (!car.isSeatbeltFastened()) {

            return new Violation(
                    "Seatbelt not fastened",
                    100
            );

        }

        return null;
    }

}