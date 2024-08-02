package study0731;

public class test38 {
    public static void main(String[] args) {
        String id = args[0];
        String password = args[1];
        if (id.equals("hello")) {
            if (password.equals("1004")) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
        else {
            System.out.println("wrong");
        }
    }
}
