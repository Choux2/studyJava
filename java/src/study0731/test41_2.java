package study0731;

public class test41_2 {
    public static void main(String[] args) {
        String id = args[0];
        String password = args[1];
        if ((id.equals("hello") || id.equals("hi") || id.equals("bonjour"))
                && password.equals("1111")) {
            System.out.println("right");
        } else {
            System.out.println("wrong");
        }
    }
}
