package study0731;

public class test41 {
    public static void main(String[] args) {
        // ||(or) 둘 중에 하나라도 참일 때
        if (true || true) {
            System.out.println(1);
        }
        if (true || false) {
            System.out.println(2);
        }
        if (false || true){
            System.out.println(3);
        }
        if (false || false){
            System.out.println(4);
        }
    }
}
