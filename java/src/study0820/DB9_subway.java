package study0820;

import study0820VO.Subway;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DB9_subway {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/study_db";
        String userName = "root";
        String password = "yerim486";

        Connection connection = DriverManager.getConnection(url, userName, password);
        Statement statement = connection.createStatement();

        boolean dropTable = statement.execute("DROP TABLE subway");

        boolean createTable = statement.execute("CREATE TABLE subway(id int(11) NOT NULL AUTO_INCREMENT, menu VARCHAR(30) NOT NULL, size int NOT NULL, bread VARCHAR(20) NOT NULL, cheese VARCHAR(30) NULL, vegi VARCHAR(100) NULL, sauce VARCHAR(50) NULL, cookie VARCHAR(30) NULL, PRIMARY KEY(id))");

        statement.execute("INSERT INTO subway(menu, size, bread, cheese, vegi, sauce, cookie) VALUES ('스테이크 & 치즈', 15, '플랫브레드', '슈레드 치즈', '오이, 양상추, 토마토', '랜치, 핫 칠리', '초코칩')");
        statement.execute("INSERT INTO subway(menu, size, bread, cheese, vegi, sauce, cookie) VALUES ('이탈리안 비엠티', 30, '위트', '모짜렐라 치즈', '피클, 할라피뇨', '엑스트라 버진 올리브 오일, 후추', '화이트 초코 마카다미아')");
        statement.execute("INSERT INTO subway(menu, size, bread, cheese, vegi, sauce, cookie) VALUES ('로티세리 바비큐 치킨', 15, '파마산 오레가노', '아메리칸 치즈', '올리브, 양상추, 피망', '스위트 칠리', null)");
        statement.execute("INSERT INTO subway(menu, size, bread, cheese, vegi, sauce, cookie) VALUES ('에그마요', 15, '화이트', '슈레드 치즈', null, null, null)");
        statement.execute("INSERT INTO subway(menu, size, bread, cheese, vegi, sauce, cookie) VALUES ('써브웨이 클럽', 30, '허니오트', '아메리칸 치즈', '오이, 양파', '스위트 어니언', '오트밀 레이즌')");

        ResultSet resultSet = statement.executeQuery("SELECT * FROM subway");

        List<Subway> subwayList = new ArrayList<>();

        while(resultSet.next()) {

            Subway subway = new Subway();

            String menu = resultSet.getString("menu");
            int size = resultSet.getInt("size");
            String bread = resultSet.getString("bread");
            String cheese = resultSet.getString("cheese");
            String vegi = resultSet.getString("vegi");
            String sauce = resultSet.getString("sauce");
            String cookie = resultSet.getString("cookie");

            subway.setMenu(menu);
            subway.setSize(size);
            subway.setBread(bread);
            subway.setCheese(cheese);
            subway.setVegi(vegi);
            subway.setSauce(sauce);
            subway.setCookie(cookie);

            subwayList.add(subway);
        }

        for (Subway subway : subwayList) {
            System.out.println(subway);
        }

        resultSet.close();
        statement.close();
        connection.close();

    }
}
