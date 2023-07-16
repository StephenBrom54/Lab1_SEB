SportsTeam.Java
public abstract class SportsTeam {
    private String teamName;
    private int wins;
    private int losses;

    public SportsTeam() {
        this.teamName = "";
        this.wins = 0;
        this.losses = 0;
    }

    public SportsTeam(String teamName) {
        this.teamName = teamName;
        this.wins = 0;
        this.losses = 0;
    }

    public double getWinPercentage() {
        return (double) wins / (wins + losses);
    }

    public abstract double[] getStats();
}

public class BasketballTeam extends SportsTeam {
    private int fieldGoals;
    private int fieldGoalsAttempted;
    private int freeThrows;
    private int freeThrowsAttempted;

    public BasketballTeam() {
        super();
        this.fieldGoals = 0;
        this.fieldGoalsAttempted = 0;
        this.freeThrows = 0;
        this.freeThrowsAttempted = 0;
    }

    public BasketballTeam(String teamName) {
        super(teamName);
        this.fieldGoals = 0;
        this.fieldGoalsAttempted = 0;
        this.freeThrows = 0;
        this.freeThrowsAttempted = 0;
    }

    public double fieldGoalPercentage() {
        return (double) fieldGoals / fieldGoalsAttempted;
    }

    public double freeThrowPercentage() {
        return (double) freeThrows / freeThrowsAttempted;
    }

    @Override
    public double[] getStats() {
        double[] stats = new double[3];
        stats[0] = getWinPercentage();
        stats[1] = fieldGoalPercentage();
        stats[2] = freeThrowPercentage();
        return stats;
    }
}

