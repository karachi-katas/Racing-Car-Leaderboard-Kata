package tddmicroexercises.leaderboard;

public class HumanDriver extends BaseDriver {

    public HumanDriver(String name, String country) {
        super(name, country);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof HumanDriver)) {
            return false;
        }
        HumanDriver other = (HumanDriver) obj;
        return this.name.equals(other.name) && this.country.equals(other.country);
    }
}
