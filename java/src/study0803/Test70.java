package study0803;

public class Test70 {
    public static void main(String[] args) {
        System.out.println(10 + 20);
        System.out.println(20 + 40);

        sum(10, 20);
        sum(20, 40);
    }

    public static void sum(int left, int right) {
        System.out.println(left + right);
    }
}
