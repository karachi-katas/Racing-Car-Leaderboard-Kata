package tddmicroexercises.leaderboard;

public class SelfDrivingCar extends BaseDriver {

    public SelfDrivingCar(String algorithmVersion, String company) {
        super("Self Driving Car - " + company + " (" + algorithmVersion + ")", company);
    }


    public void setName(String algorithmVersion) {
        this.name = "Self Driving Car - " + this.country + " (" + algorithmVersion + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SelfDrivingCar)) {
            return false;
        }
        SelfDrivingCar other = (SelfDrivingCar) obj;
        return this.name.equals(other.name) && this.country.equals(other.country);
    }

}
