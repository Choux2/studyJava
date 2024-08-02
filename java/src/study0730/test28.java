package study0730;

public class test28 {
    public static void main(String[] args) {
        double a = 3.0F;
        //float < double 이라서 데이터 손실x 이기 때문에 가능
        //float b = 3.0; 오류
        //표현범위 좁은 데이터 타입 -> 넓은 데이터 타입 변환 허용만 가능

        int c = 3;
        float d = 1.0F;
        System.out.println(c+d);
        double e = c+d;
        System.out.println(e);
    }
}
