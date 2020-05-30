package tddmicroexercises.leaderboard;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Race {

    private static final Integer[] POINTS = new Integer[]{25, 18, 15};

    private final String name;
    private final List<Car> results;

    public Race(String name, Car... cars) {
        this.name = name;
        this.results = Arrays.asList(cars);
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


    @Override
    public String toString() {
        return name;
    }

    public Map<String, Integer> getRaceResults() {
        Map<String, Integer> results = new HashMap<String, Integer>();
        for (Car car : getContestants()) {
            String driverName = car.getDriverName();
            int points = getPoints(car);
            results.put(driverName, points);
        }

        return results;
    }
}
