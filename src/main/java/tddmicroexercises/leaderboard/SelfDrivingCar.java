package tddmicroexercises.leaderboard;

public class SelfDrivingCar extends Driver {

    private String algorithmVersion;

    public SelfDrivingCar(String algorithmVersion, String company) {
        super(algorithmVersion, company);
        this.algorithmVersion = algorithmVersion;
    }

    @Override
    public String getIdentity() {
        return "Self Driving Car - " + getRepresentation() + " (" + super.getIdentity() + ")";
    }
}
