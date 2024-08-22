package study0820;

import study0820VO.Football;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DB10_football {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/study_db";
        String userName = "root";
        String password = "yerim486";

        Connection connection = DriverManager.getConnection(url, userName, password);
        Statement statement = connection.createStatement();

        boolean dropTable = statement.execute("DROP TABLE football");

        boolean creatTabel = statement.execute("CREATE TABLE football(id int(11) NOT NULL AUTO_INCREMENT, league VARCHAR(30) NOT NULL, round VARCHAR(30) NULL, home VARCHAR(30) NOT NULL, away VARCHAR(30) NOT NULL, gameTime TIMESTAMP NOT NULL, homeScore int NULL, awayScore int NULL, PRIMARY KEY(id))");

        statement.execute("INSERT INTO football(league, round, home, away, gameTime) VALUES ('Premier League', 'round 4', 'Tottenham Hotspur', 'Arsenal', '2024-09-15 22:00:00')");
        statement.execute("INSERT INTO football(league, round, home, away, gameTime, homeScore, awayScore) VALUES ('Champions League', 'quarterfinals', 'Real Madrid', 'Manchester City', '2024-04-10 04:00:00', 3, 3)");
        statement.execute("INSERT INTO football(league, round, home, away, gameTime, homeScore, awayScore) VALUES ('Bundesliga', 'round 21', 'Bayer Leverkusen', 'Bayern Munchen', '2024-02-11 02:30:00', 3, 0)");
        statement.execute("INSERT INTO football(league, round, home, away, gameTime, homeScore, awayScore) VALUES ('Club Friendlies',null, 'Bayern Munchen', 'Tottenham Hotspur', '2024-08-03 20:00:00', 2, 1)");
        statement.execute("INSERT INTO football(league, round, home, away, gameTime, homeScore, awayScore) VALUES ('K리그 1', 'round 8', '대구 FC', '대전 하나 시티즌', '2024-04-21 16:30:00', 0, 0)");

        ResultSet resultSet = statement.executeQuery("SELECT * FROM football");

        List<Football> footballList = new ArrayList<>();

        while(resultSet.next()) {

            Football football = new Football();

            String league = resultSet.getString("league");
            String round = resultSet.getString("round");
            String home = resultSet.getString("home");
            String away = resultSet.getString("away");
            Date gameTime = resultSet.getDate("gameTime");
            int homeScore = resultSet.getInt("homeScore");
            int awayScore = resultSet.getInt("awayScore");

            football.setLeague(league);
            football.setRound(round);
            football.setHome(home);
            football.setAway(away);
            football.setGameTime(gameTime);
            football.setHomeScore(homeScore);
            football.setAwayScore(awayScore);

            footballList.add(football);
        }

        for (Football football : footballList) {
            System.out.println(football);
        }

    }
}
