package tddmicroexercises.leaderboard;

import org.junit.Assert;
import org.junit.Test;

public class RaceTest {

    @Test
    public void isShouldCalculateDriverPoints() {
        // setup

        // act

        // verify
        Assert.assertEquals(25, RaceResultComputer.getPoints(TestData.race1, TestData.humanDriver1));
        Assert.assertEquals(18, RaceResultComputer.getPoints(TestData.race1, TestData.humanDriver2));
        Assert.assertEquals(15, RaceResultComputer.getPoints(TestData.race1, TestData.humanDriver3));
    }

}
