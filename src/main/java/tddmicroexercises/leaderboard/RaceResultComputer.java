package tddmicroexercises.leaderboard;

public class RaceResultComputer {

    private static final Integer[] POINTS = new Integer[]{25, 18, 15};
    public int getPoints(BaseDriver baseDriver) {
        return Race.POINTS[position(baseDriver)];
    }
}
