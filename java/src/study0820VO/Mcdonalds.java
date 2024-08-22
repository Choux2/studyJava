package study0820VO;

public class Mcdonalds {

    String bugger;

    @Override
    public String toString() {
        return "Mcdonalds{" +
                "버거:'" + bugger + '\'' +
                ", 음료:'" + beverage + '\'' +
                ", 사이드1:'" + side1 + '\'' +
                ", 사이드2:'" + side2 + '\'' +
                ", 가격:" + price + "원" +
                '}';
    }

    String beverage;
    String side1;

    public String getBugger() {
        return bugger;
    }

    public void setBugger(String bugger) {
        this.bugger = bugger;
    }

    public String getBeverage() {
        return beverage;
    }

    public void setBeverage(String beverage) {
        this.beverage = beverage;
    }

    public String getSide1() {
        return side1;
    }

    public void setSide1(String side1) {
        this.side1 = side1;
    }

    public String getSide2() {
        return side2;
    }

    public void setSide2(String side2) {
        this.side2 = side2;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    String side2;
    int price;


}
