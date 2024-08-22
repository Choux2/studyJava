package study0820VO;

import java.sql.Date;

public class Football {
    String league;
    String round;
    String home;
    String away;
    Date gameTime;
    int homeScore;
    int awayScore;

    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    public String getRound() {
        return round;
    }

    public void setRound(String round) {
        this.round = round;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getAway() {
        return away;
    }

    public void setAway(String away) {
        this.away = away;
    }

    public Date getGameTime() {
        return gameTime;
    }

    public void setGameTime(Date gameTime) {
        this.gameTime = gameTime;
    }

    public int getHomeScore() {
        return homeScore;
    }

    public void setHomeScore(int homeScore) {
        this.homeScore = homeScore;
    }

    public int getAwayScore() {
        return awayScore;
    }

    public void setAwayScore(int awayScore) {
        this.awayScore = awayScore;
    }

    @Override
    public String toString() {
        return "Football{" +
                "league='" + league + '\'' +
                ", round='" + round + '\'' +
                ", home='" + home + '\'' +
                ", away='" + away + '\'' +
                ", gameTime=" + gameTime +
                ", homeScore=" + homeScore +
                ", awayScore=" + awayScore +
                '}';
    }
}
