package study0820;

import study0820VO.Movie;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DB1_movie {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/study_db";
        String userName = "root";
        String password = "yerim486";

        Connection connection = DriverManager.getConnection(url, userName, password);
        Statement statement = connection.createStatement();

        boolean dropTable = statement.execute("drop table movie");

        boolean createTable = statement.execute
                ("create table movie(id INT(11) NOT NULL AUTO_INCREMENT, title VARCHAR(100) NOT NULL, director VARCHAR(30) NOT NULL, genre VARCHAR(20) NOT NULL, releaseDate date NOT NULL, runningTime INT NOT NULL, PRIMARY KEY(id))");

        statement.execute("INSERT INTO movie (title, director, genre, releaseDate, runningTime) VALUES ('어벤져스','조스 웨던','액션','2012-04-26',142)");
        statement.execute("INSERT INTO movie (title, director, genre, releaseDate, runningTime) VALUES ('해리포터와 마법사의 돌','크리스 콜롬버스','판타지','2001-12-14',152)");
        statement.execute("INSERT INTO movie (title, director, genre, releaseDate, runningTime) VALUES ('중경삼림','왕가위','드라마','1995-09-02',102)");
        statement.execute("INSERT INTO movie (title, director, genre, releaseDate, runningTime) VALUES ('헤어질 결심','박찬욱','멜로','2022-06-29',190)");
        statement.execute("INSERT INTO movie (title, director, genre, releaseDate, runningTime) VALUES ('겟 아웃','조던 필','미스터리','2017-05-17',104)");
        statement.execute("INSERT INTO movie (title, director, genre, releaseDate, runningTime) VALUES ('인사이드 아웃2','켈시 맨','애니메이션','2024-06-12',96)");

        ResultSet resultSet = statement.executeQuery("select * from movie");

        List<Movie> movieList = new ArrayList<>();
        while(resultSet.next()) {

            Movie movie = new Movie();

            String title = resultSet.getString("title");
            String director = resultSet.getString("director");
            String genre = resultSet.getString("genre");
            Date releaseDate = resultSet.getDate("releaseDate");
            int runningTime = resultSet.getInt("runningTime");

            movie.setTitle(title);
            movie.setDirector(director);
            movie.setGenre(genre);
            movie.setReleaseDate(releaseDate);
            movie.setRunnigTime(runningTime);

            movieList.add(movie);

//            System.out.println("제목:"+title+" / 감독:"+director+" / 장르:"+genre+" / 개봉일:"+releaseDate+" / 러닝타임:"+runningTime+"분");
        }

        for(Movie movie : movieList) {
            System.out.println(movie);
        }

        resultSet.close();
        statement.close();
        connection.close();

    }
}
