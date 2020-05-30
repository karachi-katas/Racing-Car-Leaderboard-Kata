package tddmicroexercises.leaderboard;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Race {


    private final String name;
    private final List<BaseDriver> drivers;
    private final Map<BaseDriver, Integer> driversPoint;


    public Race(String name, BaseDriver... drivers) {
        this.name = name;
        this.drivers = Arrays.asList(drivers);
        this.driversPoint = RaceResultComputer.compute(this);
    }

    public List<BaseDriver> getDrivers() {
        return drivers;
    }

    public Map<BaseDriver, Integer> getDriversPoint() {
        return driversPoint;
    }

    @Override
    public String toString() {
        return name;
    }
}
