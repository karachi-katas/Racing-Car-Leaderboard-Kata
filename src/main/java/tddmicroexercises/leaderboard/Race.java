package tddmicroexercises.leaderboard;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Race {

    private static final Integer[] POINTS = new Integer[]{25, 18, 15};

    private final String name;
    private final List<HumanDriver> results;
    private final Map<HumanDriver, String> driverNames;

    public Race(String name, HumanDriver... humanDrivers) {
        this.name = name;
        this.results = Arrays.asList(humanDrivers);
        this.driverNames = new HashMap<>();
        for (HumanDriver humanDriver : results) {
            String driverName = humanDriver.getName();
            if (humanDriver instanceof SelfDrivingCar) {
                driverName = "Self Driving Car - " + humanDriver.getCountry() + " (" + ((SelfDrivingCar) humanDriver).getAlgorithmVersion() + ")";
            }
            this.driverNames.put(humanDriver, driverName);
        }
    }

    public int position(HumanDriver humanDriver) {
        return this.results.indexOf(humanDriver);
    }

    public int getPoints(HumanDriver humanDriver) {
        return Race.POINTS[position(humanDriver)];
    }

    public List<HumanDriver> getResults() {
        return results;
    }

    public String getDriverName(HumanDriver humanDriver) {
        return this.driverNames.get(humanDriver);
    }

    @Override
    public String toString() {
        return name;
    }
}
