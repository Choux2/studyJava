package study0820VO;

public class Baseball {
    String team;
    String name;
    int backNum;
    String position;
    float avg;
    int homerun;

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBackNum() {
        return backNum;
    }

    public void setBackNum(int backNum) {
        this.backNum = backNum;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public float getAvg() {
        return avg;
    }

    public void setAvg(float avg) {
        this.avg = avg;
    }

    public int getHomerun() {
        return homerun;
    }

    public void setHomerun(int homerun) {
        this.homerun = homerun;
    }

    @Override
    public String toString() {
        return "Baseball{" +
                "team='" + team + '\'' +
                ", name='" + name + '\'' +
                ", backNum=" + backNum +
                ", position='" + position + '\'' +
                ", avg=" + avg +
                ", homerun=" + homerun +
                '}';
    }
}
