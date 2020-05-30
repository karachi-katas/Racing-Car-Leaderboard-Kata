package tddmicroexercises.leaderboard;

import org.junit.Assert;
import org.junit.Test;

public class RaceTest {

    @Test
    public void isShouldCalculateDriverPoints() {
        // setup

        // act

        // verify
        Assert.assertEquals(25, TestData.race1.getPoints(TestData.humanDrivenCar1));
        Assert.assertEquals(18, TestData.race1.getPoints(TestData.humanDrivenCar2));
        Assert.assertEquals(15, TestData.race1.getPoints(TestData.humanDrivenCar3));
    }

}
