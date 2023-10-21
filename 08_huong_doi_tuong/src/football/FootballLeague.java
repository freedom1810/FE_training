package football;

import java.util.ArrayList;

public class FootballLeague {
    private String name;
    private long moneyBonus;
    private ArrayList<FootballTeam> teams;

    public FootballLeague() {}

    public FootballLeague(String name, long moneyBonus, ArrayList<FootballTeam> teams) {
        this.name = name;
        this.moneyBonus = moneyBonus;
        this.teams = teams;
    }

    public void display() {
        System.out.println("League Name: " + name);
        System.out.println("Money Bonus: " + moneyBonus);
        System.out.println("Teams:");
        for (FootballTeam team : teams) {
            team.display();
        }
    }

    public static ArrayList<FootballLeague> getMaxLeagueTeam(ArrayList<FootballLeague> leagues) {
        int maxTeamCount = 0;
        ArrayList<FootballLeague> maxLeagues = new ArrayList<>();
        for (FootballLeague league : leagues) {
            int teamCount = league.getTeams().size();
            if (teamCount > maxTeamCount) {
                maxLeagues.clear();
                maxLeagues.add(league);
                maxTeamCount = teamCount;
            } else if (teamCount == maxTeamCount) {
                maxLeagues.add(league);
            }
        }
        return maxLeagues;
    }

    // Getter and Setter methods

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getMoneyBonus() {
        return moneyBonus;
    }

    public void setMoneyBonus(long moneyBonus) {
        this.moneyBonus = moneyBonus;
    }

    public ArrayList<FootballTeam> getTeams() {
        return teams;
    }

    public void setTeams(ArrayList<FootballTeam> teams) {
        this.teams = teams;
    }
}
