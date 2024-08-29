package study0828;

import study0828VO.Market_VO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Market_DB {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/market_db";
        String userName = "root";
        String password = "yerim486";

        Connection connection = DriverManager.getConnection(url, userName, password);
        Statement statement = connection.createStatement();
//        Statement statement2 = connection.createStatement();

        ResultSet resultSet = statement.executeQuery(
                "select m.*, b.* from member m inner join buy b on m.mem_id = b.mem_id ");
//        ResultSet resultSet2 = statement2.executeQuery("select * from buy");

        List<Market_VO> marketList = new ArrayList<>();

        while (resultSet.next()) {

            Market_VO market = new Market_VO();

            String mem_id = resultSet.getString("mem_id");
            String mem_name = resultSet.getString("mem_name");
            int mem_number = resultSet.getInt("mem_number");
            String addr = resultSet.getString("addr");
            String phone1 = resultSet.getString("phone1");
            String phone2 = resultSet.getString("phone2");
            int height = resultSet.getInt("height");
            Date debut_date = resultSet.getDate("debut_date");

            String prod_name = resultSet.getString("prod_name");
            String group_name = resultSet.getString("group_name");
            int price = resultSet.getInt("price");
            int amount = resultSet.getInt("amount");

            market.setMem_id(mem_id);
            market.setMem_name(mem_name);
            market.setMem_number(mem_number);
            market.setAddr(addr);
            market.setPhone1(phone1);
            market.setPhone2(phone2);
            market.setHeight(height);
            market.setDebut_date(debut_date);

            market.setProd_name(prod_name);
            market.setGroup_name(group_name);
            market.setPrice(price);
            market.setAmount(amount);

            marketList.add(market);
//            System.out.println(mem_id);
        }

//        while (resultSet2.next()) {
//            Market_vo market2 = new Market_vo();
//
//            String prod_name = resultSet2.getString("prod_name");
//            String group_name = resultSet2.getString("group_name");
//            int price = resultSet2.getInt("price");
//            int amount = resultSet2.getInt("amount");
//
//            market2.setProd_name(prod_name);
//            market2.setGroup_name(group_name);
//            market2.setPrice(price);
//            market2.setAmount(amount);
//
//            marketList.add(market2);
////            System.out.println(prod_name);
//        }

        for (Market_VO market : marketList) {
            System.out.println(market);
        }

        resultSet.close();
//        resultSet2.close();
        statement.close();
//        statement2.close();
        connection.close();
    }
}
