package study0822VO;

public class Category {
    String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Category{" +
                "type='" + type + '\'' +
                '}';
    }
}
