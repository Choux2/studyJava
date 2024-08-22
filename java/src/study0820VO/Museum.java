package study0820VO;


import java.sql.Date;

public class Museum {

    String type;
    String name;

    @Override
    public String toString() {
        return "Museum{" +
                "분류='" + type + '\'' +
                ", 문화재명='" + name + '\'' +
                ", 지정년도=" + year +
                ", 소재지='" + place + '\'' +
                ", 제작시기='" + period + '\'' +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        this.year = year;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    Date year;
    String place;
    String period;




}
