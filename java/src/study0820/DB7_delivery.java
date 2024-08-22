package study0820;

import study0820VO.Delivery;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DB7_delivery {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/study_db";
        String userName = "root";
        String password = "yerim486";

        Connection connection = DriverManager.getConnection(url, userName, password);
        Statement statement = connection.createStatement();

//        boolean dropTable = statement.execute("DROP TABLE delivery");
//
//        boolean createTable = statement.execute("CREATE TABLE delivery (id int(11) NOT NULL AUTO_INCREMENT, food VARCHAR(20) NOT NULL, store VARCHAR(100) NOT NULL, orderId VARCHAR(100) NOT NULL, orderTime DATETIME DEFAULT CURRENT_TIMESTAMP, address VARCHAR(100), PRIMARY KEY(id))");
//
//        statement.execute("INSERT INTO delivery (food, store, orderId, address) VALUES ('요거트아이스크림', '요거트 아이스크림의 정석 마곡점', '생쥐수염', '양천향교역')");
//        statement.execute("INSERT INTO delivery (food, store, orderId, address) VALUES ('고추바사삭', '굽네치킨 상대점', '붐바슈슈', '트리풀시티')");
//        statement.execute("INSERT INTO delivery (food, store, orderId, address) VALUES ('고구마무스피자', '자가제빵 선명희피자', '피자깡패', '한남더힐')");
//        statement.execute("INSERT INTO delivery (food, store, orderId, address) VALUES ('set1 떡볶이+오뎅+만두', '신가네 매운떡볶이', '고3', '둔산여고 정문')");
//        statement.execute("INSERT INTO delivery (food, store, orderId, address) VALUES ('싸이버거 세트', '맘스터치', 'choux2', '반포자이')");

        ResultSet resultSet = statement.executeQuery("SELECT * FROM delivery");

        List<Delivery> deliveryList = new ArrayList<>();

        while(resultSet.next()) {

            Delivery delivery = new Delivery();

            String food = resultSet.getString("food");
            String store = resultSet.getString("store");
            String orderId = resultSet.getString("orderId");
            Date orderTime = resultSet.getDate("orderTime");
            String address = resultSet.getString("food");

            delivery.setFood(food);
            delivery.setStore(store);
            delivery.setOrderId(orderId);
            delivery.setOrderTime(orderTime);
            delivery.setAddress(address);

            deliveryList.add(delivery);
        }

        for (Delivery delivery : deliveryList) {
            System.out.println(delivery);
        }

        resultSet.close();
        statement.close();
        connection.close();

    }
}
