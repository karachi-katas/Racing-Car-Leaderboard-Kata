package tddmicroexercises.leaderboard;

public class SelfDrivingCar implements Car {

    private String algorithmVersion;
    private String company;

    public SelfDrivingCar(String algorithmVersion, String company) {
        this.algorithmVersion = algorithmVersion;
        this.company = company;
    }

    public String getAlgorithmVersion() {
        return algorithmVersion;
    }

    public void setAlgorithmVersion(String algorithmVersion) {
        this.algorithmVersion = algorithmVersion;
    }

    @Override
    public String getDriverName() {
        return "Self Driving Car - " + company + " (" + getAlgorithmVersion() + ")";
    }
}
