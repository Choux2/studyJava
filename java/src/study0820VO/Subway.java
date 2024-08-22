package study0820VO;

public class Subway {
    String menu;
    int size;
    String bread;
    String cheese;
    String vegi;
    String sauce;
    String cookie;

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public String getCheese() {
        return cheese;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public String getVegi() {
        return vegi;
    }

    public void setVegi(String vegi) {
        this.vegi = vegi;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public String getCookie() {
        return cookie;
    }

    public void setCookie(String cookie) {
        this.cookie = cookie;
    }

    @Override
    public String toString() {
        return "Subway{" +
                "menu='" + menu + '\'' +
                ", size=" + size +
                ", bread='" + bread + '\'' +
                ", cheese='" + cheese + '\'' +
                ", vegi='" + vegi + '\'' +
                ", sauce='" + sauce + '\'' +
                ", cookie='" + cookie + '\'' +
                '}';
    }
}
