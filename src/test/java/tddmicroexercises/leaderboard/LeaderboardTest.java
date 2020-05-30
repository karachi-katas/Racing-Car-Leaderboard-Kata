package tddmicroexercises.leaderboard;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static tddmicroexercises.leaderboard.TestData.*;

public class LeaderboardTest {

    @Test
    public void itShouldSumThePoints() {
        // setup
        Leaderboard leaderboard = LeaderboardComputer.generate(race1, race2, race3);
        // act
        Map<BaseDriver, Integer> results = leaderboard.getPoints();

        // verify
        assertTrue("results " + results, results.containsKey(TestData.humanDriver2));
        assertEquals(18 + 18 + 25, (int) results.get(TestData.humanDriver2));
    }

    @Test
    public void isShouldFindTheWinner() {
        // setup
        Leaderboard leaderboard = LeaderboardComputer.generate(race1, race2, race3);

        // act
        List<String> result = leaderboard.driverRankings();

        // verify
        assertEquals("Lewis Hamilton", result.get(0));
    }

    @Test
    public void itShouldKeepAllDriversWhenSamePoints() {
        // setup
        // bug, drops drivers with same points
        Race winDriver1 = new Race("Australian Grand Prix", humanDriver1, humanDriver2, humanDriver3);
        Race winDriver2 = new Race("Malaysian Grand Prix", humanDriver2, humanDriver1, humanDriver3);
        Leaderboard exEquoLeaderBoard = LeaderboardComputer.generate(winDriver1, winDriver2);

        // act
        List<String> rankings = exEquoLeaderBoard.driverRankings();

        // verify
        assertEquals(Arrays.asList(humanDriver2.getName(), humanDriver1.getName(), humanDriver3.getName()), rankings);
        // note: the order of driver1 and driver2 is JDK/platform dependent
    }

}
