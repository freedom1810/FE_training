package football;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Tạo danh sách cầu thủ
        FootballPlayer player1 = new FootballPlayer("Player 1", 25, "Address 1", 180.5, 75.0, 1000000);
        FootballPlayer player2 = new FootballPlayer("Player 2", 28, "Address 2", 175.0, 68.5, 800000);
        ArrayList<FootballPlayer> players = new ArrayList<>();
        players.add(player1);
        players.add(player2);

        // Tạo câu lạc bộ và thêm cầu thủ vào đó
        FootballTeam team = new FootballTeam("Team A", 5000000, players);

        // Tạo giải đấu và thêm câu lạc bộ vào đó
        ArrayList<FootballTeam> teams = new ArrayList<>();
        teams.add(team);
        FootballLeague league = new FootballLeague("League 1", 10000000, teams);

        // Hiển thị thông tin giải đấu
        league.display();

        // Sắp xếp cầu thủ theo lương
        players = FootballPlayer.sortSalary(players);
        System.out.println("Sorted Players by Salary:");
        for (FootballPlayer player : players) {
            player.display();
        }

        // Tìm câu lạc bộ có giá trị lớn nhất
        ArrayList<FootballTeam> maxTeams = FootballTeam.findMaxValuesTeam(teams);
        System.out.println("Teams with Maximum Value:");
        for (FootballTeam maxTeam : maxTeams) {
            maxTeam.display();
        }


    }
}

