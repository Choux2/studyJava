package study0805;

public class Test79 {
    public static void main(String[] args) {
        for (int i = 0; i<5; i++) {
            a();
            System.out.println(i);
        }
    }

    static void a() {
        int i =0; //지역변수 - 바깥에 영향을 미치지 않음
    }
}
