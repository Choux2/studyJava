package study0828;

import study0828VO.Delivery_VO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Delivery_DB {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/delivery_db";
        String userName = "root";
        String password = "yerim486";

        Connection connection = DriverManager.getConnection(url, userName, password);
        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery
                ("select m.*, s.*, b.*, c.* from menu m inner join store s on m.store_id = s.id inner join brand b on s.brand_id = b.id inner join category c on b.category_id = c.id");

        List<Delivery_VO> deliveryList = new ArrayList<>();
//        deliveryList.;
        while (resultSet.next()) {

            Delivery_VO delivery = new Delivery_VO();

            String type = resultSet.getString("type");

            String brnadName = resultSet.getString("b.name");

            String storeName = resultSet.getString("s.name");
            String addr = resultSet.getString("addr");
            String tel = resultSet.getString("tel");
            String deli = resultSet.getString("deli");
            String open = resultSet.getString("open");
            String close = resultSet.getString("close");
            int review = resultSet.getInt("review");

            String menuName = resultSet.getString("m.name");
            int price = resultSet.getInt("price");

            delivery.setType(type);
            delivery.setBrandName(brnadName);
            delivery.setStoreName(storeName);
            delivery.setAddr(addr);
            delivery.setTel(tel);
            delivery.setDeli(deli);
            delivery.setOpen(open);
            delivery.setClose(close);
            delivery.setReview(review);
            delivery.setMenuName(menuName);
            delivery.setPrice(price);

            deliveryList.add(delivery);
        }

        if (deliveryList.contains("")) {

        }

        for (Delivery_VO delivery : deliveryList) {
            System.out.println(delivery);




        }

        resultSet.close();
        statement.close();
        connection.close();

    }

}
