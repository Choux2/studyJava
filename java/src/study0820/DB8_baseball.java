package study0820;

import study0820VO.Baseball;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DB8_baseball {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/study_db";
        String userName = "root";
        String password = "yerim486";

        Connection connection = DriverManager.getConnection(url, userName, password);
        Statement statement = connection.createStatement();

        boolean dropTable = statement.execute("drop table baseball");

        boolean createTable = statement.execute("CREATE TABLE baseball(id int(11) NOT NULL AUTO_INCREMENT, team VARCHAR(20) NOT NULL, name VARCHAR(20) NOT NULL, backNum int NOT NULL, position VARCHAR(50) NOT NULL, avg float NULL, homerun int NULL, PRIMARY KEY(id))");

        statement.execute("INSERT INTO baseball(team, name, backNum, position, avg, homerun) VALUES ('한화 이글스','노시환', 8, '내야수', 0.281, 23)");
        statement.execute("INSERT INTO baseball(team, name, backNum, position, avg, homerun) VALUES ('기아 타이거즈', '김도영', 5, '내야수', 0.340, 31)");
        statement.execute("INSERT INTO baseball(team, name, backNum, position, avg, homerun) VALUES ('키움 히어로즈','송성문', 24, '내야수', 0.344, 15)");
        statement.execute("INSERT INTO baseball(team, name, backNum, position, avg, homerun) VALUES ('SSG 랜더스','최정', 14, '내야수', 0.292, 31)");
        statement.execute("INSERT INTO baseball(team, name, backNum, position, avg, homerun) VALUES ('삼성 라이온즈','구자욱', 5, '외야수', 0.322, 22)");
        statement.execute("INSERT INTO baseball(team, name, backNum, position, avg, homerun) VALUES ('NC 다이노스','박건우', 37, '외야수', 0.344, 13)");
        statement.execute("INSERT INTO baseball(team, name, backNum, position, avg, homerun) VALUES ('두산 베어스','양의지', 25, '포수', 0.319, 15)");
        statement.execute("INSERT INTO baseball(team, name, backNum, position, avg, homerun) VALUES ('KT 위즈','강백호', 50, '내야수', 0.290, 24)");
        statement.execute("INSERT INTO baseball(team, name, backNum, position, avg, homerun) VALUES ('LG 트윈스','홍창기', 51, '외야수', 0.310, 4)");
        statement.execute("INSERT INTO baseball(team, name, backNum, position, avg, homerun) VALUES ('롯데 자이언츠','윤동희', 91, '외야수', 0.292, 10)");

        ResultSet resultSet = statement.executeQuery("SELECT * FROM baseball");

        List<Baseball> baseballList = new ArrayList<>();

        while(resultSet.next()) {
            Baseball baseball = new Baseball();

            String team = resultSet.getString("team");
            String name = resultSet.getString("name");
            int backNum = resultSet.getInt("backNum");
            String position = resultSet.getString("position");
            float avg = resultSet.getFloat("avg");
            int homerun = resultSet.getInt("homerun");

            baseball.setTeam(team);
            baseball.setName(name);
            baseball.setBackNum(backNum);
            baseball.setPosition(position);
            baseball.setAvg(avg);
            baseball.setHomerun(homerun);

            baseballList.add(baseball);
        }

        for (Baseball baseball : baseballList) {
            System.out.println(baseball);
        }

        resultSet.close();
        statement.close();
        connection.close();

    }
}
