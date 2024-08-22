package study0820;

import study0820VO.Museum;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DB4_museum {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/study_db";
        String userName = "root";
        String password = "yerim486";

        Connection connection = DriverManager.getConnection(url, userName, password);
        Statement statement = connection.createStatement();

        boolean dropTable = statement.execute("drop table museum");

        boolean createTable = statement.execute
                ("CREATE TABLE museum (id int(11) not null auto_increment, type varchar(20) not null, name varchar(50) not null, year date null, place varchar(100) not null, period varchar(20) not null, primary key (id))");

        statement.execute("INSERT INTO museum (type, name, year, place, period) VALUES ('유물', '백제금동대향로', '1996-05-30', '국립부여박물관', '백제시대')");
        statement.execute("INSERT INTO museum (type, name, year, place, period) VALUES ('기록유산', '조선왕조실록', '1973-12-31', '서울대학교 규장각한국학연구원', '조선')");
        statement.execute("INSERT INTO museum (type, name, year, place, period) VALUES ('기록유산','진흥왕 순수비','1962-12-20', '국립중앙박물관', '삼국시대')");
        statement.execute("INSERT INTO museum (type, name, year, place, period) VALUES ('유물','금동아미타여래좌상','1962-12-20', '불국사 극락전', '남북국시대')");
        statement.execute("INSERT INTO museum (type, name, year, place, period) VALUES ('유물','화엄사 영산회 괘불탱','1997-09-22', '화엄사', '조선')");

        ResultSet resultSet = statement.executeQuery("select * FROM museum");

        List<Museum> museumList = new ArrayList<>();

        while(resultSet.next()) {

            Museum museum = new Museum();

            String type = resultSet.getString("type");
            String name = resultSet.getString("name");
            Date year = resultSet.getDate("year");
            String place = resultSet.getString("place");
            String period = resultSet.getString("period");

            museum.setType(type);
            museum.setName(name);
            museum.setYear(year);
            museum.setPlace(place);
            museum.setPeriod(period);

            museumList.add(museum);
//            System.out.println(type+"/"+name+"/"+year+"/"+place+"/"+period);
        }

        for(Museum museum : museumList) {
            System.out.println(museum);
        }

        resultSet.close();
        statement.close();
        connection.close();

    }

}
