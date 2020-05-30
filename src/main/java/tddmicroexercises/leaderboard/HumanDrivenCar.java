package tddmicroexercises.leaderboard;

public class HumanDrivenCar implements Car {

    private Driver driver;

    public HumanDrivenCar(Driver driver) {
        this.driver = driver;
    }


    @Override
    public String getName() {
        return driver.getName();
    }

    @Override
    public String getCountry() {
        return driver.getCountry();
    }
}
