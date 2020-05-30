package tddmicroexercises.leaderboard;

public class SelfDrivingCar implements Car {

    private String algorithmVersion;
    private String country;

    public SelfDrivingCar(String algorithmVersion, String company) {
        this.algorithmVersion = algorithmVersion;
        this.country = company;
    }

    public String getAlgorithmVersion() {
        return algorithmVersion;
    }

    public void setAlgorithmVersion(String algorithmVersion) {
        this.algorithmVersion = algorithmVersion;
    }

    @Override
    public String getName() {
        return "Self Driving Car - " + getCountry() + " (" + getAlgorithmVersion() + ")";
    }

    @Override
    public String getCountry() {
        return country;
    }
}
