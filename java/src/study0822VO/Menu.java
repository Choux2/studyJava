package study0822VO;

public class Menu {
    int store_id;
    String name;
    int price;

    public int getStore_id() {
        return store_id;
    }

    public void setStore_id(int store_id) {
        this.store_id = store_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "store_id=" + store_id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
