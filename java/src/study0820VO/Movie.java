package study0820VO;

import java.util.Date;

public class Movie {
    String title;
    String director;
    String genre;
    Date releaseDate;
    int runnigTime;

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", genre='" + genre + '\'' +
                ", releaseDate=" + releaseDate +
                ", runnigTime=" + runnigTime +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getRunnigTime() {
        return runnigTime;
    }

    public void setRunnigTime(int runnigTime) {
        this.runnigTime = runnigTime;
    }
}
