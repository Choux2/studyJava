package study0820;

import study0820VO.ABLY;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DB5_ably {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/study_db";
        String userName = "root";
        String password = "yerim486";

        Connection connection = DriverManager.getConnection(url, userName, password);
        Statement statement = connection.createStatement();

        boolean dropTable = statement.execute("DROP TABLE ably");

        boolean createTable = statement.execute
                ("CREATE TABLE ably (id INT(11) NOT NULL AUTO_INCREMENT, category1 VARCHAR(15) NOT NULL, category2 VARCHAR(20) NOT NULL, name VARCHAR(100) NOT NULL, color VARCHAR(20) NULL, size VARCHAR(10) NULL, price int NOT NULL, market VARCHAR(50) NOT NULL, PRIMARY KEY(id))");

        statement.execute("INSERT INTO ably (category1, category2, name, color, price, market) VALUES ('아우터', '가디건', '디테일 라이닝 가디건', '딥그레이프', 34900, '슬로우앤드')");
        statement.execute("INSERT INTO ably (category1, category2, name, color, size, price, market) VALUES ('팬츠', '데님', '파스텔와이드데님PT', '중청', '160ver', 36900, '고고싱')");
        statement.execute("INSERT INTO ably (category1, category2, name, color, size, price, market) VALUES ('원피스', '롱원피스', '번체크브이스트링롱OPS', '브라운', 'FREE', 26000, '육육걸즈')");
        statement.execute("INSERT INTO ably (category1, category2, name, color, size, price, market) VALUES ('신발', '스니커즈', '퓨어 플랫폼 스니커즈 AFHC79A58', '블랙', '230', 19900, '슈펜')");
        statement.execute("INSERT INTO ably (category1, category2, name, color, price, market) VALUES ('가방', '백팩', '피그먼트 홀리 복조리백 보부상백 백팩', '차콜', 22000, '홀리')");

        ResultSet resultSet = statement.executeQuery("SELECT * FROM ably");

        List<ABLY> ablyList = new ArrayList<>();

        while(resultSet.next()) {

            ABLY ably = new ABLY();

            String category1 = resultSet.getString("category1");
            String category2 = resultSet.getString("category2");
            String name = resultSet.getString("name");
            String color = resultSet.getString("color");
            String size = resultSet.getString("size");
            int price = resultSet.getInt("price");
            String market = resultSet.getString("market");

            ably.setCategory1(category1);
            ably.setCategory2(category2);
            ably.setName(name);
            ably.setColor(color);
            ably.setSize(size);
            ably.setPrice(price);
            ably.setMarket(market);

            ablyList.add(ably);
        }

        for (ABLY ably : ablyList) {
            System.out.println(ably);
        }

        resultSet.close();
        statement.close();
        connection.close();
    }
}
