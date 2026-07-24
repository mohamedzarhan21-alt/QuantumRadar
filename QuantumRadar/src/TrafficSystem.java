import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TrafficSystem {

    private Radar radar;
    private List<TrafficFine> fines;

    public TrafficSystem() {
        radar = new Radar();
        fines = new ArrayList<>();
    }

    public TrafficFine processCar(CarObservation car) {

        List<Violation> violations = radar.checkCar(car);

        if (violations.isEmpty()) {
            return null;
        }

        TrafficFine fine = new TrafficFine(
                car.getPlateNumber(),
                violations
        );

        fines.add(fine);

        return fine;
    }

    public List<TrafficFine> getAllFines() {
        return fines;
    }

    public Map<String, Integer> getViolationStatistics() {

        Map<String, Integer> statistics = new HashMap<>();

        for (TrafficFine fine : fines) {

            for (Violation violation : fine.getViolations()) {

                String description = violation.getDescription();

                statistics.put(
                        description,
                        statistics.getOrDefault(description, 0) + 1
                );
            }

        }

        return statistics;
    }

}