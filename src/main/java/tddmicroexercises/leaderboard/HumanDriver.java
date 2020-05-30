package tddmicroexercises.leaderboard;

public class HumanDriver {

    private final String name;
    private final String country;

    public HumanDriver(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public int hashCode() {
        return name.hashCode() * 31 + country.hashCode();
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
