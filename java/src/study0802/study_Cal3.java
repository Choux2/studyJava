package study0802;

import java.util.Scanner;

public class study_Cal3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i, j, result=0;
        String str;

        System.out.print("숫자1: ");
        i = sc.nextInt();
        System.out.print("+-*/");
        str = sc.next();
        System.out.print("숫자2: ");
        j = sc.nextInt();

        if (str.equals("+")) {
            result= plus(i,j);
        } else if (str.equals("-")) {
            result= min(i,j);
        } else if (str.equals("*")) {
            result= mul(i,j);
        } else if (str.equals("/")) {
            result= div(i,j);
        } else {

        }

        System.out.println(result);

    }

    public static int plus(int a, int b) {
        return a+b;
    }

    public static int min(int a, int b) {
        return a-b;
    }

    public static int mul(int a, int b) {
        return a*b;
    }

    public static int div(int a, int b) {
        return a/b;
    }

}
