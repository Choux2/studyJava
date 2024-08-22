package study0820;

import study0820VO.Carrot;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DB6_carrot {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/study_db";
        String userName = "root";
        String password = "yerim486";

        Connection connection = DriverManager.getConnection(url, userName, password);
        Statement statement = connection.createStatement();

        boolean dropTable = statement.execute("DROP TABLE carrot");

        boolean createTable = statement.execute("CREATE TABLE carrot(id INT(11) NOT NULL AUTO_INCREMENT, sellerId VARCHAR(30) NOT NULL, uploadDate Datetime NULL, title VARCHAR(100) NOT NULL, price int NOT NULL, contents VARCHAR(500) NOT NULL, place VARCHAR(100) NOT NULL, PRIMARY KEY(id))");

        statement.execute("INSERT INTO carrot (sellerId, uploadDate, title, price, contents, place) VALUES ('생쥐수염', NOW(), '초코송이 팝니다', 1000, '초코송이 하나 남아서 싸게 팝니다 얼먹해드시면 굿', '트리풀시티 정문')");
        statement.execute("INSERT INTO carrot (sellerId, uploadDate, title, price, contents, place) VALUES ('메롱이', NOW(), '야구유니폼 판매', 150000, '사이즈 90 새제품입니다!! 택배가능', '한밭야구장')");
        statement.execute("INSERT INTO carrot (sellerId, uploadDate, title, price, contents, place) VALUES ('은쉉쉉', '2024-12-12', '2024 수능특강', 5000, '다풀었는데 참고용으로 사실분', '유성고')");
        statement.execute("INSERT INTO carrot (sellerId, uploadDate, title, price, contents, place) VALUES ('비냐', NOW(), '카루타 상의 싸게 처분합니다', 500000000, '문의주세요', '헤네시스 자유시장 24채')");
        statement.execute("INSERT INTO carrot (sellerId, uploadDate, title, price, contents, place) VALUES ('돌맨', '2023-11-30','먹다남은 개껌 팔아요', 100000, '제 입맛엔 별로네요', '직거래 불가')");

        ResultSet resultSet = statement.executeQuery("SELECT * FROM carrot");

        List<Carrot> carrotList = new ArrayList<>();

        while(resultSet.next()) {

            Carrot carrot = new Carrot();

            String sellerId = resultSet.getString("sellerId");
            String title = resultSet.getString("title");
            Date uploadDate = resultSet.getDate("uploadDate");
            int price = resultSet.getInt("price");
            String contents = resultSet.getString("contents");
            String place = resultSet.getString("place");

            carrot.setsellerId(sellerId);
            carrot.setTitle(title);
            carrot.setuploadDate(uploadDate);
            carrot.setPrice(price);
            carrot.setContents(contents);
            carrot.setPlace(place);

            carrotList.add(carrot);
        }

        for (Carrot carrot : carrotList) {
            System.out.println(carrot);
        }

        resultSet.close();
        statement.close();
        connection.close();

    }
}
