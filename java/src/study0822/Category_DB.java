package study0822;

import study0822VO.Category;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Category_DB {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/delivery_db";
        String userName = "root";
        String password = "yerim486";

        Connection connection = DriverManager.getConnection(url, userName, password);
        Statement statement = connection.createStatement();

//        boolean createTable = statement.execute("CREATE TABLE category (id INT(11) NOT NULL AUTO_INCREMENT, type VARCHAR(20) NOT NULL, PRIMARY KEY(id))");

//        statement.execute("INSERT INTO category (type) VALUES ('버거')");
//        statement.execute("INSERT INTO category (type) VALUES ('치킨')");
//        statement.execute("INSERT INTO category (type) VALUES ('피자')");
//        statement.execute("INSERT INTO category (type) VALUES ('카페∙디저트')");
//        statement.execute("INSERT INTO category (type) VALUES ('분식')");
//        statement.execute("INSERT INTO category (type) VALUES ('족발∙보쌈')");
//        statement.execute("INSERT INTO category (type) VALUES ('중식')");
//        statement.execute("INSERT INTO category (type) VALUES ('양식')");

        ResultSet resultSet = statement.executeQuery("SELECT * FROM category");

        List<Category> categoryList = new ArrayList<>();

        while(resultSet.next()) {
            Category category = new Category();
            String type = resultSet.getString("type");

            category.setType(type);
            categoryList.add(category);
        }

        for (Category category : categoryList) {
            System.out.println(category);
        }

        resultSet.close();
        statement.close();
        connection.close();

    }
}
