package tddmicroexercises.leaderboard;

public class Driver {

    private final String identity;
    private final String origin;

    public Driver(String identity, String origin) {
        this.identity = identity;
        this.origin = origin;
    }

    public String getIdentity() {
        return identity;
    }

    public String getOrigin() {
        return origin;
    }

    @Override
    public int hashCode() {
        return identity.hashCode() * 31 + origin.hashCode();
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
        return this.identity.equals(other.identity) && this.origin.equals(other.origin);
    }
}
