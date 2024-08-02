package study0731;

public class test40_2 {
    public static void main(String[] args) {
        //test38 참고
        String id = args[0];
        String password = args[1];
        if (id.equals("hello") && password.equals("1004")) {
            System.out.println("right");
        } else {
            System.out.println("wrong");
        }
    }
}
