package tddmicroexercises.leaderboard;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Race {

    private static final Integer[] POINTS = new Integer[]{25, 18, 15};

    private final String name;
    private final List<Car> contestants;

    public Race(String name, Car... cars) {
        this.name = name;
        this.contestants = Arrays.asList(cars);
    }

    public int position(Car car) {
        return this.contestants.indexOf(car);
    }

    public int getPoints(Car car) {
        return Race.POINTS[position(car)];
    }


    @Override
    public String toString() {
        return name;
    }

    public Map<String, Integer> getRaceResults() {
        Map<String, Integer> results = new HashMap<>();
        for (Car car : contestants) {
            String driverName = car.getDriverName();
            int points = getPoints(car);
            results.put(driverName, points);
        }

        return results;
    }
}
