package tddmicroexercises.leaderboard;

import java.util.*;
import java.util.stream.Collectors;

public class LeaderboardComputer {

    public static Leaderboard generate(Race... races){
        Map<BaseDriver, Integer> results = computePointsForRaces(races);
        List<BaseDriver> driversRanking = driverRankings(results);
        List<String> driversNameRanking = driversRanking.stream().map(BaseDriver::getName).collect(Collectors.toList());
        return new Leaderboard(driversNameRanking, results, races);
    }

    public static Map<BaseDriver, Integer> computePointsForRaces(Race... races){
        Map<BaseDriver, Integer> results = new HashMap();
        for (Race race : races) {
            Map<BaseDriver, Integer> racePoints = race.getDriversPoint();
            for(BaseDriver baseDriver: racePoints.keySet()){
                Integer points = racePoints.get(baseDriver);
                if (results.containsKey(baseDriver)) {
                    results.put(baseDriver, results.get(baseDriver) + points);
                } else {
                    results.put(baseDriver, 0 + points);
                }
            }
        }
        return results;
    }

    public static Map<BaseDriver, Integer> computePointsForRaces(List<Race> races){
        Map<BaseDriver, Integer> results = new HashMap();
        for (Race race : races) {
            Map<BaseDriver, Integer> racePoints = race.getDriversPoint();
            for(BaseDriver baseDriver: racePoints.keySet()){
                int points = racePoints.get(baseDriver);
                if (results.containsKey(baseDriver)) {
                    results.put(baseDriver, results.get(baseDriver) + points);
                } else {
                    results.put(baseDriver, 0 + points);
                }
            }
        }
        return results;
    }



    private static List<BaseDriver> driverRankings(Map<BaseDriver, Integer> results) {
        List<BaseDriver> resultsList = new ArrayList<>(results.keySet());
        Collections.sort(resultsList, new DriverByPointsDescendingComparator(results));
        return resultsList;
    }

    private static final class DriverByPointsDescendingComparator implements Comparator<BaseDriver> {
        private final Map<BaseDriver, Integer> results;

        private DriverByPointsDescendingComparator(Map<BaseDriver, Integer> results) {
            this.results = results;
        }

        @Override
        public int compare(BaseDriver driver1, BaseDriver driver2) {
            Integer pointsOfDriver1 = results.get(driver1);
            Integer pointsOfDriver2 = results.get(driver2);
            return -pointsOfDriver1.compareTo(pointsOfDriver2);
        }
    }



}
