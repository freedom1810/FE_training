package football;

import java.util.ArrayList;

public class FootballTeam {
    private String name;
    private long valuesTeam;
    private ArrayList<FootballPlayer> players;

    public FootballTeam() {}

    public FootballTeam(String name, long valuesTeam, ArrayList<FootballPlayer> players) {
        this.name = name;
        this.valuesTeam = valuesTeam;
        this.players = players;
    }

    public void display() {
        System.out.println("Team Name: " + name);
        System.out.println("Team Value: " + valuesTeam);
        System.out.println("Players:");
        for (FootballPlayer player : players) {
            player.display();
        }
    }

    public double avgAgeTeam() {
        int totalAge = 0;
        for (FootballPlayer player : players) {
            totalAge += player.getAge();
        }
        return (double) totalAge / players.size();
    }

    public static ArrayList<FootballTeam> findMaxValuesTeam(ArrayList<FootballTeam> teams) {
        long maxValue = 0;
        ArrayList<FootballTeam> maxTeams = new ArrayList<>();
        for (FootballTeam team : teams) {
            if (team.getValuesTeam() > maxValue) {
                maxTeams.clear();
                maxTeams.add(team);
                maxValue = team.getValuesTeam();
            } else if (team.getValuesTeam() == maxValue) {
                maxTeams.add(team);
            }
        }
        return maxTeams;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getValuesTeam() {
        return valuesTeam;
    }

    public void setValuesTeam(long valuesTeam) {
        this.valuesTeam = valuesTeam;
    }

    public ArrayList<FootballPlayer> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<FootballPlayer> players) {
        this.players = players;
    }
}
