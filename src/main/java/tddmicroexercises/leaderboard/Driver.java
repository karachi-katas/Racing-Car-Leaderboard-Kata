package tddmicroexercises.leaderboard;

public class Driver {

    private final String name;

    public Driver(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    @Override
    public int hashCode() {
        return name.hashCode() * 31;
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
        return this.name.equals(other.name);
    }
}
