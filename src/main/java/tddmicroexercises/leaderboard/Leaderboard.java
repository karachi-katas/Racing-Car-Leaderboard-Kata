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
    private Map<String, Integer> results;

    public Leaderboard(Race... races) {

        this.races = Arrays.asList(races);
        this.results=new HashMap<String, Integer>();
        calculateResults();
    }

    private void calculateResults(){

        for (Race race : this.races) {
            for (IDriver driver : race.getDrivers()) {
                accumulatePoints(race,driver);
            }
        }
    }

    private void accumulatePoints(Race race,IDriver driver){
        String driverName = driver.getIdentity();
        int points = race.getPoints(driver);
        if (results.containsKey(driverName)) {
            results.put(driverName, results.get(driverName) + points);
        } else {
            results.put(driverName,points);
        }
    }

    public Map<String, Integer> getResults() {
        return results;
    }



    public List<String> driverRankings() {
        Map<String, Integer> results = getResults();
        List<String> resultsList = new ArrayList<>(results.keySet());
        Collections.sort(resultsList, new DriverByPointsDescendingComparator(results));
        return resultsList;
    }

    private static final class DriverByPointsDescendingComparator implements Comparator<String> {
        private final Map<String, Integer> results;

        private DriverByPointsDescendingComparator(Map<String, Integer> results) {
            this.results = results;
        }

        @Override
        public int compare(String driverName1, String driverName2) {
            return -results.get(driverName1).compareTo(results.get(driverName2));
        }
    }

}
