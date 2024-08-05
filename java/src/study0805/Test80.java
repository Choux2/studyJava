package study0805;

public class Test80 {
    public static void main(String[] args) {
        for (int i=0; i<5; i++) {
            a();
            System.out.println(i);
        }
    }

    static int i; //전역변수
    static void a() {
        i=0;
    }
}
