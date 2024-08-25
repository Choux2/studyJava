package study0822;

import study0822VO.Brand;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Brand_DB {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/delivery_db";
        String userName = "root";
        String password = "yerim486";

        Connection connection = DriverManager.getConnection(url, userName, password);
        Statement statement = connection.createStatement();

        boolean dropTable = statement.execute("DROP TABLE brand");

        boolean creatTable = statement.execute("CREATE TABLE brand (id INT(11) NOT NULL AUTO_INCREMENT, category_id int NOT NULL, name VARCHAR(30) NOT NULL, PRIMARY KEY(id))");

        statement.execute("INSERT INTO brand (category_id, name) VALUES (1, '맥도날드')");
        statement.execute("INSERT INTO brand (category_id, name) VALUES (1, '맘스터치')");
        statement.execute("INSERT INTO brand (category_id, name) VALUES (2, 'BHC')");
        statement.execute("INSERT INTO brand (category_id, name) VALUES (2, '굽네치킨')");
        statement.execute("INSERT INTO brand (category_id, name) VALUES (3, '도미노피자')");
        statement.execute("INSERT INTO brand (category_id, name) VALUES (3, '피자헛')");
        statement.execute("INSERT INTO brand (category_id, name) VALUES (4, '뚜레쥬르')");
        statement.execute("INSERT INTO brand (category_id, name) VALUES (4, '설빙')");
        statement.execute("INSERT INTO brand (category_id, name) VALUES (5, '동대문엽기떡볶이')");
        statement.execute("INSERT INTO brand (category_id, name) VALUES (5, '국수나무')");

        ResultSet resultSet = statement.executeQuery("SELECT * FROM brand");

        List<Brand> brandList = new ArrayList<>();

        while(resultSet.next()) {

            Brand brand = new Brand();
            int category_id = resultSet.getInt("category_id");
            String name = resultSet.getString("name");

            brand.setCategory_id(category_id);
            brand.setName(name);

            brandList.add(brand);
        }
        for (Brand brand : brandList) {
            System.out.println(brand);
        }

        resultSet.close();
        statement.close();
        connection.close();

    }
}
