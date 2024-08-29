package study0828VO;

import java.sql.Time;

public class Delivery_VO {
    //category
    String type;

    //brand
    String brandName;

    //store
    String storeName;
    String addr;
    String tel;
    String deli;
    String open;
    String close;
    int review;

    //menu
    String menuName;
    int price;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getDeli() {
        return deli;
    }

    public void setDeli(String deli) {
        this.deli = deli;
    }

    public String getOpen() {
        return open;
    }

    public void setOpen(String open) {
        this.open = open;
    }

    public String getClose() {
        return close;
    }

    public void setClose(String close) {
        this.close = close;
    }

    public int getReview() {
        return review;
    }

    public void setReview(int review) {
        this.review = review;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Delivery_DB{" +
                "type='" + type + '\'' +
                ", brandName='" + brandName + '\'' +
                ", storeName='" + storeName + '\'' +
                ", addr='" + addr + '\'' +
                ", tel='" + tel + '\'' +
                ", deli='" + deli + '\'' +
                ", open=" + open +
                ", close=" + close +
                ", review=" + review +
                ", menuName='" + menuName + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
