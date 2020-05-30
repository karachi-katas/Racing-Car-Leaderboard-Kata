package tddmicroexercises.leaderboard;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Race {

    private static final Integer[] POINTS = new Integer[]{25, 18, 15};

    private final String name;
    private final List<Car> results;
    private final Map<Car, String> carNames;

    public Race(String name, Car... cars) {
        this.name = name;
        this.results = Arrays.asList(cars);
        this.carNames = new HashMap<>();
        for (Car car : results) {
            String driverName = car.getName();
            this.carNames.put(car, driverName);
        }
    }

    public int position(Car car) {
        return this.results.indexOf(car);
    }

    public int getPoints(Car car) {
        return Race.POINTS[position(car)];
    }

    public List<Car> getContestants() {
        return results;
    }

    public String getCarName(Car car) {
        return this.carNames.get(car);
    }

    @Override
    public String toString() {
        return name;
    }

    public Map<String, Integer> getRaceResults() {
        Map<String, Integer> results = new HashMap<String, Integer>();
        for (Car driver : getContestants()) {
            String driverName = getCarName(driver);
            int points = getPoints(driver);
            results.put(driverName, points);
        }

        return results;
    }
}
