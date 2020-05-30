package tddmicroexercises.leaderboard;

public class SelfDrivingCar extends Driver {

    private String algorithmVersion;

    public SelfDrivingCar(String algorithmVersion, String company) {
        super("Self Driving Car - " + company + " (" +
                algorithmVersion + ")", company);
        this.algorithmVersion = algorithmVersion;
    }

    public String getAlgorithmVersion() {
        return algorithmVersion;
    }

    public void setAlgorithmVersion(String algorithmVersion) {
        this.algorithmVersion = algorithmVersion;
    }
}
