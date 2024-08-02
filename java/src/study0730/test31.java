package study0730;

public class test31 {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        float c = 10.0F;
        float d = 3.0f;

        System.out.println(a/b); //정수 -> 실수인 경우 소수점 이하 값 누락
        System.out.println(c/d);
        System.out.println(a/d);
    }
}
