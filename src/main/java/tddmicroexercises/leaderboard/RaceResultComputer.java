package tddmicroexercises.leaderboard;

import java.util.HashMap;
import java.util.Map;

public class RaceResultComputer {

    private static final Integer[] POINTS = new Integer[]{25, 18, 15};

    public static int getPoints(Race race, BaseDriver baseDriver) {
        return POINTS[position(race, baseDriver)];
    }

    private static int position(Race race, BaseDriver baseDriver) {
        return race.getDrivers().indexOf(baseDriver);
    }

    public static Map<BaseDriver, Integer> compute(Race race){
        Map<BaseDriver, Integer> points = new HashMap<>();
        for (BaseDriver baseDriver:race.getDrivers()) {
            points.put(baseDriver, getPoints(race, baseDriver));
        }
        return points;
    }

}
