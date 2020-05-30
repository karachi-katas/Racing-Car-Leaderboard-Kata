package tddmicroexercises.leaderboard;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Race {

    private static final Integer[] POINTS = new Integer[]{25, 18, 15};

    private final String name;
    private final List<BaseDriver> results;
    private final Map<BaseDriver, String> driverNames;

    public Race(String name, BaseDriver... baseDrivers) {
        this.name = name;
        this.results = Arrays.asList(baseDrivers);
        this.driverNames = new HashMap<>();
        for (BaseDriver baseDriver : results) {
            String driverName = baseDriver.getName();
            this.driverNames.put(baseDriver, driverName);
        }
    }

    public int position(BaseDriver baseDriver) {
        return this.results.indexOf(baseDriver);
    }

    public int getPoints(BaseDriver baseDriver) {
        return Race.POINTS[position(baseDriver)];
    }

    public List<BaseDriver> getResults() {
        return results;
    }

    public String getDriverName(BaseDriver baseDriver) {
        return this.driverNames.get(baseDriver);
    }

    @Override
    public String toString() {
        return name;
    }
}
