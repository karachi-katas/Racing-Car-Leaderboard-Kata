package tddmicroexercises.leaderboard;

public class HumanDrivenCar implements Car {

    private Driver driver;

    public HumanDrivenCar(Driver driver) {
        this.driver = driver;
    }


    @Override
    public String getDriverName() {
        return driver.getName();
    }

}
