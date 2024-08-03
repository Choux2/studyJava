package study0802;

import java.util.Scanner;

public class Study_Cal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i, j, k;
        String str;

        System.out.print("숫자를 입력하세요:");
        i = sc.nextInt();
        System.out.print("연산자를 입력하세요:");
        str = sc.next();

        while (!str.equals("+") && !str.equals("-") && !str.equals("*") && !str.equals("/"))
        {
            System.out.print("연산자를 다시 입력하세요:");
            str = sc.next();
        }

        System.out.print("숫자를 입력하세요:");
        j = sc.nextInt();
        System.out.print("= ");


        if (str.equals("+")) {
            System.out.println(plus(i,j));
        } else if (str.equals("-")) {
            System.out.println(min(i,j));
        } else if (str.equals("*")) {
            System.out.println(mul(i,j));
        } else if (str.equals("/")) {
            System.out.println(div(i,j));
        } else {

        }
        System.out.println("");
        System.out.print("계속하시겠습니까? 1. 네 2. 아니오 : ");
        k = sc.nextInt();
        if (k==1){
            main(args);
        } else if (k==2) {
            System.out.println("계산기 종료");
        }

    }

     static int plus (int a, int b) {
        return a+b;
    }

    static int min (int a, int b) {
        return a-b;
    }

    static int mul (int a, int b) {
        return a*b;
    }

    static int div (int a, int b) {
        return a/b;
    }

}
