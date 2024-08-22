package study0820;

import study0820VO.Olive0;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DB2_olive0 {
    public static void main(String[] args) throws SQLException {
;
        String url = "jdbc:mysql://localhost:3306/study_db";
        String userName = "root";
        String password = "yerim486";

        Connection connection = DriverManager.getConnection(url, userName, password);
        Statement statement = connection.createStatement();

        boolean dropTable = statement.execute("drop table olive0");

        boolean createTable = statement.execute
                ("CREATE TABLE olive0(id int(11) not null auto_increment, type varchar(30) not null, brand varchar(30) not null, name varchar(100) not null, color varchar(20) null, price int not null, primary key(id))");

        statement.execute("INSERT INTO olive0 (type, brand, name, color, price) VALUES ('스킨케어','라운드랩','1025 독도토너 200ml 기획(+50ml 증정)','',15000)");
        statement.execute("INSERT INTO olive0 (type, brand, name, color, price) VALUES ('메이크업','롬앤','쥬시 래스팅 틴트','베어그레이프',8900)");
        statement.execute("INSERT INTO olive0 (type, brand, name, color, price) VALUES ('향수','랑방','에끌라 드 아르페쥬 EDP','',44800)");
        statement.execute("INSERT INTO olive0 (type, brand, name, color, price) VALUES ('건강식품','오쏘몰','이뮨 멀티비타민&미네랄 14입 (2주분)','',75000)");
        statement.execute("INSERT INTO olive0 (type, brand, name, color, price) VALUES ('구강용품','라덴스','베럴 혀클리너 리뉴얼','블루',9900)");

        ResultSet resultSet = statement.executeQuery("select * from olive0");

        List<Olive0> olive0List = new ArrayList<>();

        while(resultSet.next()) {

            Olive0 olive0 = new Olive0();

            String type = resultSet.getString("type");
            String brand = resultSet.getString("brand");
            String name = resultSet.getString("name");
            String color = resultSet.getString("color");
            int price = resultSet.getInt("price");

            olive0.setType(type);
            olive0.setBrand(brand);
            olive0.setName(name);
            olive0.setColor(color);
            olive0.setPrice(price);

            olive0List.add(olive0);

//            System.out.println(type+"/"+brand+""+name+""+color+"/"+price+"원");
        }

        for(Olive0 olive0 : olive0List) {
            System.out.println(olive0);
        }

        resultSet.close();
        statement.close();
        connection.close();
    }
}
