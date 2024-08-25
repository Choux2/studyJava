package study0822;

import study0822VO.Store;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Store_DB {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/delivery_db";
        String userName = "root";
        String password = "yerim486";

        Connection connection = DriverManager.getConnection(url, userName, password);
        Statement statement = connection.createStatement();

        boolean dropoTable = statement.execute("DROP TABLE store");
        boolean creatTable = statement.execute("CREATE TABLE store (id INT(11) NOT NULL AUTO_INCREMENT, brand_id int NOT NULL, name VARCHAR(50) NOT NULL, PRIMARY KEY(id))");

        statement.execute("INSERT INTO store (brand_id, name) VALUES (1, '목원대점')");
        statement.execute("INSERT INTO store (brand_id, name) VALUES (1, '유성온천역점')");
        statement.execute("INSERT INTO store (brand_id, name) VALUES (2, '도안상대점')");
        statement.execute("INSERT INTO store (brand_id, name) VALUES (2, '갈마행복점')");
        statement.execute("INSERT INTO store (brand_id, name) VALUES (3, '유성온천점')");
        statement.execute("INSERT INTO store (brand_id, name) VALUES (3, '도안점')");
        statement.execute("INSERT INTO store (brand_id, name) VALUES (4, '도안신도시점')");
        statement.execute("INSERT INTO store (brand_id, name) VALUES (4, '둔산갤러리아점')");
        statement.execute("INSERT INTO store (brand_id, name) VALUES (5, '유성점')");
        statement.execute("INSERT INTO store (brand_id, name) VALUES (6, '대전도안점')");
        statement.execute("INSERT INTO store (brand_id, name) VALUES (7, '대전도안상대점')");
        statement.execute("INSERT INTO store (brand_id, name) VALUES (8, '유성온천점')");
        statement.execute("INSERT INTO store (brand_id, name) VALUES (9, '대전궁동로데오점')");
        statement.execute("INSERT INTO store (brand_id, name) VALUES (10, '대전상대점')");


        ResultSet resultSet = statement.executeQuery("SELECT * FROM store");

        List<Store> storeList = new ArrayList<>();

        while(resultSet.next()) {
            Store store = new Store();

            int brand_id = resultSet.getInt("brand_id");
            String name = resultSet.getString("name");

            store.setBrand_id(brand_id);
            store.setName(name);
            storeList.add(store);
        }

        for(Store store : storeList) {
            System.out.println(store);
        }

        resultSet.close();
        statement.close();
        connection.close();

    }
}
