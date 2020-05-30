package tddmicroexercises.leaderboard;

public class Driver extends Participant {


    public Driver(String name, String country) {
        super(name, country);
    }

    public String getName() {
        return this.name;
    }

    public String getCountry() {
        return this.affiliation;
    }

    @Override
    public int hashCode() {
        return name.hashCode() * 31 + this.affiliation.hashCode();
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
        return this.name.equals(other.name) && this.affiliation.equals(other.affiliation);
    }
}
