import java.util.ArrayList;
import java.util.List;

public class Radar {

    private List<ViolationRule> rules;

    public Radar() {

        rules = new ArrayList<>();

        rules.add(new SeatbeltRule());
        rules.add(new PrivateSpeedRule());
        rules.add(new TruckSpeedRule());

    }

    public List<Violation> checkCar(CarObservation car) {

        List<Violation> violations = new ArrayList<>();

        for (ViolationRule rule : rules) {

            Violation violation = rule.check(car);

            if (violation != null) {
                violations.add(violation);
            }

        }

        return violations;

    }

}