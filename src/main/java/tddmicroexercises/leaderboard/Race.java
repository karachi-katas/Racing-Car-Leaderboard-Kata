package tddmicroexercises.leaderboard;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Race {

    private static final Integer[] POINTS = new Integer[]{25, 18, 15};

    private final String name;
    private final List<Driver> results;

    public Race(String name, Driver... drivers) {
        this.name = name;
        this.results = Arrays.asList(drivers);
    }

    private int position(Driver driver) {
        return this.results.indexOf(driver);
    }

    public int getPoints(Driver driver) {
        return Race.POINTS[position(driver)];
    }

    public Map<String ,Integer> accumalatePoints(Map<String, Integer> LeaderBoard) {
        for (Driver driver : this.results ) {
            String driverName = driver.getIdentity();
            int points = this.getPoints(driver);
            if (LeaderBoard.containsKey(driverName)) {
                LeaderBoard.put(driverName, LeaderBoard.get(driverName) + points);
            } else {
                LeaderBoard.put(driverName, 0 + points);
            }
        }
        return LeaderBoard;
    }

    public List<Driver> getResults() {
        return results;
    }

    @Override
    public String toString() {
        return name;
    }
}
