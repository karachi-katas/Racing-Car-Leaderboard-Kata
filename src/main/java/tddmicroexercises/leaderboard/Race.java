package tddmicroexercises.leaderboard;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Race {

    private static final Integer[] POINTS = new Integer[]{25, 18, 15};

    private final String name;
    private final List<Participant> results;
    private final Map<Participant, String> participantNames;

    public Race(String name, Participant... participants) {
        this.name = name;
        this.results = Arrays.asList(participants);
        this.participantNames = new HashMap<>();
        for (Participant driver : results) {
            String driverName = driver.getName();
            //TODO: refactor code.
            this.participantNames.put(driver, driverName);
        }
    }

    public int position(Participant driver) {
        return this.results.indexOf(driver);
    }

    public int getPoints(Participant driver) {
        return Race.POINTS[position(driver)];
    }

    public List<Participant> getResults() {
        return results;
    }

    public String getDriverName(Participant driver) {
        return this.participantNames.get(driver);
    }

    @Override
    public String toString() {
        return name;
    }
}
