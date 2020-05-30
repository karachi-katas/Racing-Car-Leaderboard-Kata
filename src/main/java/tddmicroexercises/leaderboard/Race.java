package tddmicroexercises.leaderboard;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Race {

    private  Integer[] points;

    private final String name;
    private final List<Participant> results;

    public Race(String name, Integer[] points , Participant... participants) {
        this.name = name;
        this.results = Arrays.asList(participants);
        this.points = points;
    }

    public Race(String name , Participant... participants) {
        this(name, new Integer[]{25, 18, 15}, participants);
    }

    public int position(Participant driver) {
        return this.results.indexOf(driver);
    }

    public int getPoints(Participant driver) {
        return points[position(driver)];
    }

    public List<Participant> getResults() {
        return results;
    }

    public String getDriverName(Participant driver) {
        return driver.getName();
    }

    @Override
    public String toString() {
        return name;
    }
}
