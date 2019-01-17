package de.exxcellent.challenge.data;

// Object to store football data
public class FootballData  {
    private String teamName;
    private int goalsAllowed = 0;
    private int goals = 0;
    private int diffInGoals = 0;


    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getGoalsAllowed() {
        return goalsAllowed;
    }

    public void setGoalsAllowed(int goalsAllowed) {
        this.goalsAllowed = goalsAllowed;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public int getDiffInGoals() {
        return diffInGoals;
    }

    public void setDiffInGoals(int diffInGoals) {
        this.diffInGoals = diffInGoals;
    }
}
