package tddmicroexercises.leaderboard;

import java.util.Arrays;
import java.util.List;

public class Race {

    private static final Integer[] POINTS = new Integer[]{25, 18, 15};

    private final String name;
    private final List<IDriver> drivers;

    public Race(String name, IDriver... drivers) {
        this.name = name;
        this.drivers = Arrays.asList(drivers);

    }

    private int position(IDriver driver) {
        return this.drivers.indexOf(driver);
    }

    public int getPoints(IDriver driver) {
        return Race.POINTS[position(driver)];
    }

    public List<IDriver> getDrivers() {
        return drivers;
    }

    @Override
    public String toString() {
        return name;
    }
}
