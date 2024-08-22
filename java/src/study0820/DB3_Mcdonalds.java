package study0820;

import study0820VO.Mcdonalds;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DB3_Mcdonalds {

    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/study_db";
        String userName = "root";
        String password = "yerim486";

        Connection connection = DriverManager.getConnection(url, userName, password);
        Statement statement = connection.createStatement();

        boolean dropTable = statement.execute("DROP TABLE Mcdonalds");

        boolean createTable = statement.execute
                ("CREATE TABLE Mcdonalds (id INT(11) NOT NULL AUTO_INCREMENT, bugger VARCHAR(30) NULL, beverage VARCHAR(30) NULL, side1 VARCHAR(30) NULL, side2 VARCHAR(30) NULL, price int NOT NULL, PRIMARY KEY(id))");

        statement.execute("INSERT INTO Mcdonalds(bugger, beverage, side1, side2, price) VALUES ('불고기버거', '제로콜라', '후렌치후라이', '치즈스틱', '13500')");
        statement.execute("INSERT INTO Mcdonalds (bugger, beverage, side1, price) VALUES ('슈슈버거', '환타', '코울슬로', 5000)");
        statement.execute("INSERT INTO Mcdonalds (side1, price) VALUES ('맥윙', 2400)");
        statement.execute("INSERT INTO Mcdonalds (bugger, beverage, price) VALUES ('상하이 치킨 스택랩', '스프라이트', 9000)");
        statement.execute("INSERT INTO Mcdonalds (bugger, beverage, side1, side2, price) VALUES ('치킨 치즈 맥모닝', '자두 칠러', '맥너겟', '케이준 소스', 5000)");

        ResultSet resultSet = statement.executeQuery("SELECT * FROM Mcdonalds");

        List<Mcdonalds> McdonaldsList = new ArrayList<>();

        while (resultSet.next()) {

            Mcdonalds mcdonalds = new Mcdonalds();

            String bugger = resultSet.getString("bugger");
            String beverage = resultSet.getString("beverage");
            String side1 = resultSet.getString("side1");
            String side2 = resultSet.getString("side2");
            int price = resultSet.getInt("price");

            mcdonalds.setBugger(bugger);
            mcdonalds.setBeverage(beverage);
            mcdonalds.setSide1(side1);
            mcdonalds.setSide2(side2);
            mcdonalds.setPrice(price);

            McdonaldsList.add(mcdonalds);
//            System.out.println("버거메뉴:"+bugger+" / 음료:"+beverage+" / 사이드메뉴:"+side1+" / 사이드메뉴:"+side2+" / 총 금액:"+price+"원");
        }

        for(Mcdonalds mcdonalds : McdonaldsList) {
            System.out.println(mcdonalds);
        }

        resultSet.close();
        statement.close();
        connection.close();
    }
}
