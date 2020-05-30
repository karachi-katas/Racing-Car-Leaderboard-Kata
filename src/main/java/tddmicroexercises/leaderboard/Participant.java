package tddmicroexercises.leaderboard;

public abstract class Participant {
    protected String name;
    protected String affiliation;

    public Participant(String name, String affiliation) {
        this.name = name;
        this.affiliation = affiliation;
    }

    public String getName() {
        return name;
    }

    public String getAffiliation() {
        return affiliation;
    }
}
