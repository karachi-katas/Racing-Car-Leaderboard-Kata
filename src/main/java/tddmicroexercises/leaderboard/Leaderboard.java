package tddmicroexercises.leaderboard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leaderboard {

    private final List<Race> races;
    private final List<String> driverRankings;
    private final Map<BaseDriver, Integer> Points;

    public Leaderboard(Race... races) {
        this.races = Arrays.asList(races);
        driverRankings = new ArrayList<>();
        Points = new HashMap<>();
    }

    public Leaderboard(List<String> driverRankings, Map<BaseDriver, Integer> Points, Race... races) {
        this.races = Arrays.asList(races);
        this.driverRankings = driverRankings;
        this.Points = Points;
    }

    public List<Race> getRaces() {
        return races;
    }

    public Map<BaseDriver, Integer> getPoints() {
        return Points;
    }

    public List<String> driverRankings() {
        return driverRankings;
    }


}
