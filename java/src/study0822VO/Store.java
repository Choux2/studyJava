package study0822VO;

public class Store {
    int brand_id;
    String name;

    public int getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(int brand_id) {
        this.brand_id = brand_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Store{" +
                "brand_id=" + brand_id +
                ", name='" + name + '\'' +
                '}';
    }
}
