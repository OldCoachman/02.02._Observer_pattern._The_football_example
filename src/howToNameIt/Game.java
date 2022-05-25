package howToNameIt;

/**
 * Class which represents a match and its parameters.
 */
public class Game {
    /**
     * When there is a match.
     */
    private String date;

    /**
     * Where there is a match.
     */
    private String place;

    /**
     * Some game conditions.
     */
    private String plan;

    /**
     * The first football team.
     */
    private String club1;

    /**
     * The second football team.
     */
    private String club2;

    Game (String date, String place, String plan, String club1, String club2) {
        this.date = date;
        this.place = place;
        this.plan = plan;
        this.club1 = club1;
        this.club2 = club2;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public void setClub1(String club1) {
        this.club1 = club1;
    }

    public void setClub2(String club2) {
        this.club2 = club2;
    }

    public String getDate() {
        return date;
    }

    public String getPlace() {
        return place;
    }

    public String getPlan() {
        return plan;
    }

    public String getClub1() {
        return club1;
    }

    public String getClub2() {
        return club2;
    }
}
