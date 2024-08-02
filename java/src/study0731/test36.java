package study0731;

public class test36 {
    public static void main(String[] args) {
        if (false) { //true면 if조건 실행 false면 else 넘어감
            System.out.println(1);
        } else {
            System.out.println(2);
        }

        //첫번째 if 마지막 else(생략가능) else if 여려개 가능
        if(false) {
            System.out.println(1);
        } else if(true) {
            System.out.println(2);
        } else if(true) {
            System.out.println(3); //제일 먼저 true인 구간 실행
        } else {
            System.out.println(4);
        }
    }
}
