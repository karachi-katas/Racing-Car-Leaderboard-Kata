package tddmicroexercises.leaderboard;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Race {

    private static final Integer[] POINTS = new Integer[]{25, 18, 15};

    private final String name;
    private final List<IDriver> results;

    public Race(String name, IDriver... drivers) {
        this.name = name;
        this.results = Arrays.asList(drivers);

    }

    public int position(IDriver driver) {
        return this.results.indexOf(driver);
    }

    public int getPoints(IDriver driver) {
        return Race.POINTS[position(driver)];
    }

    public List<IDriver> getResults() {
        return results;
    }

    @Override
    public String toString() {
        return name;
    }
}
