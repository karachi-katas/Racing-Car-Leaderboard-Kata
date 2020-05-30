package tddmicroexercises.leaderboard;

public abstract class BaseDriver {
    protected String name;
    protected String country;

    public BaseDriver(String name, String country) {
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
    public abstract boolean equals(Object obj);

}
