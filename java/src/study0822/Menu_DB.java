package study0822;

import study0822VO.Menu;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Menu_DB {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/delivery_db";
        String userName = "root";
        String password = "yerim486";

        Connection connection = DriverManager.getConnection(url, userName, password);
        Statement statement = connection.createStatement();

        boolean dropTable = statement.execute("DROP TABLE menu");
        boolean createTable = statement.execute("CREATE TABLE menu (id INT(11) NOT NULL AUTO_INCREMENT, store_id int NOT NULL, name VARCHAR(50) NOT NULL, price int NOT NULL, PRIMARY KEY(id))");

        statement.execute("INSERT INTO menu (store_id, name, price) VALUES (1, '맥치킨 라지 세트', 7500)");
        statement.execute("INSERT INTO menu (store_id, name, price) VALUES (2, '진도 대파 크림 크로켓 버거 세트', 10200)");
        statement.execute("INSERT INTO menu (store_id, name, price) VALUES (3, '슈퍼싸이버거 세트', 10800)");
        statement.execute("INSERT INTO menu (store_id, name, price) VALUES (4, '사랑의하츄핑 순살세트', 26400)");
        statement.execute("INSERT INTO menu (store_id, name, price) VALUES (5, '뿌링클', 21000)");
        statement.execute("INSERT INTO menu (store_id, name, price) VALUES (6, '후라이드 반/양념 반', 21000)");
        statement.execute("INSERT INTO menu (store_id, name, price) VALUES (7, '볼케이노', 19900)");
        statement.execute("INSERT INTO menu (store_id, name, price) VALUES (8, '고추바사삭', 19900)");
        statement.execute("INSERT INTO menu (store_id, name, price) VALUES (9, '블랙타이거 슈림프L', 32400)");
        statement.execute("INSERT INTO menu (store_id, name, price) VALUES (10, '베이컨 포테이토L', 33900)");
        statement.execute("INSERT INTO menu (store_id, name, price) VALUES (11, '인절미설빙', 9500)");
        statement.execute("INSERT INTO menu (store_id, name, price) VALUES (12, '통밀후레쉬샌드위치', 7000)");
        statement.execute("INSERT INTO menu (store_id, name, price) VALUES (13, '마라떡볶이', 16000)");
        statement.execute("INSERT INTO menu (store_id, name, price) VALUES (14, '생면국수', 6000)");


        ResultSet resultSet = statement.executeQuery("SELECT * FROM menu");

        List<Menu> menuList = new ArrayList<>();

        while(resultSet.next()) {
            Menu menu = new Menu();

            int store_id = resultSet.getInt("store_id");
            String name = resultSet.getString("name");
            int price = resultSet.getInt("price");

            menu.setStore_id(store_id);
            menu.setName(name);
            menu.setPrice(price);

            menuList.add(menu);
        }

        for(Menu menu : menuList) {
            System.out.println(menu);
        }

        resultSet.close();
        statement.close();
        connection.close();
    }
}
