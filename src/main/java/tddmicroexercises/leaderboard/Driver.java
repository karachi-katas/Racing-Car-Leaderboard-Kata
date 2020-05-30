package tddmicroexercises.leaderboard;

public class Driver implements IDriver {

    private final String name;
    private final String country;

    public Driver(String name, String country) {
        this.name = name;
        this.country = country;
    }

    @Override
    public String getIdentity() {
        return name;
    }

    @Override
    public String getRepresentation() {
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
        if (obj == null || !(obj instanceof Driver)) {
            return false;
        }
        Driver other = (Driver) obj;
        return this.name.equals(other.name) && this.country.equals(other.country);
    }
}
