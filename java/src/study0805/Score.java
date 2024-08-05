package study0805;

import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        double kor, eng, math, tot;
        double avg=0;

        System.out.print("이름: "); name = sc.next();
        System.out.print("국어: "); kor = sc.nextInt();
        System.out.print("영어: "); eng = sc.nextInt();
        System.out.print("수학: "); math = sc.nextInt();

        System.out.print("총점: ");
        tot = tot(kor, eng, math); System.out.println(tot);
        System.out.print("평균: ");
        avg = avg(kor, eng, math); System.out.println(avg);

        System.out.print("성적: ");
        if(avg>=90 && avg<=100) {
            System.out.println("수");
        } else if (avg>=80 && avg<=89) {
            System.out.println("우");
        } else if (avg>=70 && avg<=79) {
            System.out.println("미");
        } else if (avg>=60 && avg<=69) {
            System.out.println("양");
        } else {
            System.out.println("가");
        }
    }

    static double tot (double a, double b, double c) {
        return a+b+c;
    }

    static double avg (double a, double b, double c) {
        return (a+b+c) / 3;
    }
}


//이름국영수 점수를 받아서 평균과 총점 구하고 평균 90점이상 수 80점이상 우 70미 60양 나머지 가