package study0820VO;

import java.sql.Date;

public class Carrot {
    String sellerId;
    Date uploadDate;
    String title;
    int price;
    String contents;
    String place;

    public String getsellerId() {
        return sellerId;
    }

    public void setsellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    public Date getuploadDate() {
        return uploadDate;
    }

    public void setuploadDate(Date uploadDate) {
        this.uploadDate = uploadDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    @Override
    public String toString() {
        return "Carrot{" +
                "sellerId='" + sellerId + '\'' +
                ", uploadDate=" + uploadDate +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", contents='" + contents + '\'' +
                ", place='" + place + '\'' +
                '}';
    }
}
