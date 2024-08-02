package study0731;

import java.sql.SQLOutput;

public class test40 {
    public static void main(String[] args) {
        //&&(and) 둘 다 참일 때
        if (true && true) {
            System.out.println(1);
        }
        if (true && false) {
            System.out.println(2);
        }
        if (false && true) {
            System.out.println(3);
        }
        if (false && false) {
            System.out.println(4);
        }
    }
}
