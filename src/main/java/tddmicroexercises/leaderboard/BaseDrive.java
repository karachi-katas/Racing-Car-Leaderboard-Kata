package tddmicroexercises.leaderboard;

public abstract class BaseDrive {
    private String name;
    private String country;

    public BaseDrive(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public abstract String getName();

    @Override
    public int hashCode() {
        return name.hashCode() * 31 + country.hashCode();
    }

    @Override
    public abstract boolean equals(Object obj);

}
