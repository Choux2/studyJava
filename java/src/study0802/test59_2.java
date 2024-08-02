package study0802;

public class test59_2 {
    public static int one() {
        return 1; //이미 여기서 종료가 되기 때문에 아래 리턴값들은 실행 자체 x
//        return 2;
//        return 3;
    }

    public static String num(int i) {
        if(i==0) {
            return "zero";
        } else if(i==1) {
            return "one";
        } else if(i==2) {
            return "two";
        }
        return "none";
    }

    public static void main(String[] args) {
        System.out.println(one());
        System.out.println(num(1));
    }
}
