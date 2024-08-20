package study0807;

public class MegaCoffee {

    private String type;
    private String name;
    private String hot;
    private int price;

    //lombok @Getter @Setter
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

    public String getHot() {
        return hot;
    }

    public void setHot(String hot) {
        this.hot = hot;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public MegaCoffee() {

    }

    MegaCoffee(String type, String name, String hot, int price) {
        this.type = type;
        this.name = name;
        this.hot = hot;
        this.price = price;
    }

    public String toString() {
        return "["+type+"] "+hot+" "+name+" "+price+"원";
    }

    // 종류 (커피, 차, 음료, 베이커리 등등)

    // 음료 이름

    // 핫 / 아이스

    // 가격


}
