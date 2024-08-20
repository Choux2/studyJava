package study0819;

import study0807.MegaCoffee;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Test1 {
public static void main(String[] args) throws SQLException {

    // 1. db 연결
    String url = "jdbc:mysql://localhost:3306/study_db";
    String userName = "root";
    String password = "yerim486";

    Connection connection = DriverManager.getConnection(url, userName, password);
    Statement statement = connection.createStatement();

    // 2. db 작업
    // 2-1. 기존 존재하면 테이블 삭제 (drop)
    boolean dropTable = statement.execute("drop table megacoffee");

    // 2-2. 테이블 생성 (create)
    boolean createTable = statement.execute
            ("create table megacoffee(type VARCHAR(30) NOT NULL ,name VARCHAR(50) NOT NULL, hot VARCHAR(10) NULL, price INT NOT NULL)");

    // 2-3. 데이터 생성 (insert)
    statement.execute("INSERT INTO megacoffee (type, name, hot, price) VALUES('커피','아메리카노','핫',1000)");
    statement.execute("INSERT INTO megacoffee (type, name, hot, price) VALUES('커피','아메리카노','아이스',1000)");
    statement.execute("INSERT INTO megacoffee (type, name, hot, price) VALUES('차','아이스티','아이스',1500)");
    statement.execute("INSERT INTO megacoffee (type, name, hot, price) VALUES('에이드','자몽에이드','',2000)");


    // 2-4. 데이터 조회
    ResultSet resultSet = statement.executeQuery("select * from megacoffee");
//    resultSet.next();
//    System.out.println(resultSet);

    List<MegaCoffee> megaCoffeeList = new ArrayList<>();
    while(resultSet.next()) {
        MegaCoffee mc = new MegaCoffee();

        String type = resultSet.getString("type");
        String name = resultSet.getString("name");
        String hot = resultSet.getString("hot");
        int price = resultSet.getInt("price");

        mc.setType(type);
        mc.setName(name);
        mc.setHot(hot);
        mc.setPrice(price);

//        System.out.println(type+"/"+name+"/"+hot+"/"+price);

        megaCoffeeList.add(mc);
    }

    for(MegaCoffee menu : megaCoffeeList) {
        System.out.println(menu);
    }


//    String name = resultSet.getString("name");
//    System.out.println(name);


    // 3. db 연결 종료
    resultSet.close();
    statement.close();
    connection.close();


    // 10개 테이블 , 컬럼 최소 5개 이상씩 pk 필수
    // insert row 5개 이상

    // 내일 할일
    // 10개 테이블 -> List<VO>

        
    }
}
