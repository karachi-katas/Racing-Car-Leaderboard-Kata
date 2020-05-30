package tddmicroexercises.leaderboard;

public class TestData {

    public static Driver driver1;
    public static Driver driver2;
    public static Driver driver3;
    public static SelfDrivingCar selfDrivingCar;

    public static Race race1;
    public static Race race2;
    public static Race race3;
    public static Race race4;
    public static Race race5;
    public static Race race6;

    public static Leaderboard sampleLeaderboard1;
    public static Leaderboard sampleLeaderboard2;

    public static HumanDrivenCar humanDrivenCar1;
    public static HumanDrivenCar humanDrivenCar2;
    public static HumanDrivenCar humanDrivenCar3;



    static {

        driver1 = new Driver("Nico Rosberg");
        driver2 = new Driver("Lewis Hamilton");
        driver3 = new Driver("Sebastian Vettel");

        humanDrivenCar1 = new HumanDrivenCar(driver1);
        humanDrivenCar2 = new HumanDrivenCar(driver2);
        humanDrivenCar3 = new HumanDrivenCar(driver3);
        selfDrivingCar = new SelfDrivingCar("1.2", "Acme");

        race1 = new Race("Australian Grand Prix", humanDrivenCar1, humanDrivenCar2, humanDrivenCar3);
        race2 = new Race("Malaysian Grand Prix", humanDrivenCar3, humanDrivenCar2, humanDrivenCar1);
        race3 = new Race("Chinese Grand Prix", humanDrivenCar2, humanDrivenCar1, humanDrivenCar3);
        race4 = new Race("Fictional Grand Prix 1", humanDrivenCar1, humanDrivenCar2, selfDrivingCar);
        race5 = new Race("Fictional Grand Prix 2", selfDrivingCar, humanDrivenCar2, humanDrivenCar1);
        selfDrivingCar.setAlgorithmVersion("1.3");
        race6 = new Race("Fictional Grand Prix 3", humanDrivenCar2, humanDrivenCar1, selfDrivingCar);

        sampleLeaderboard1 = new Leaderboard(race1, race2, race3);
        sampleLeaderboard2 = new Leaderboard(race4, race5, race6);
    }
}
