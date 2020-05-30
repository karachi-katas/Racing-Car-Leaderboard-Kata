package tddmicroexercises.leaderboard;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Race {



    private final String name;
    private final List<BaseDriver> results;


    public Race(String name, BaseDriver... baseDrivers) {
        this.name = name;
        this.results = Arrays.asList(baseDrivers);

    }

    public int position(BaseDriver baseDriver) {
        return this.results.indexOf(baseDriver);
    }



    public List<BaseDriver> getResults() {
        return results;
    }


    @Override
    public String toString() {
        return name;
    }
}
