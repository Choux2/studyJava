package study0801;

public class test44 {
    public static void main(String[] args) {
        /*초기값, 반복조건, 반복 시 초기값을 변경시켜주는 구성의 반복문이라면 > for
        for (초기화; 종료조건; 반복실행) {
        반복적으로 실행될 구문
        }
        */
        for (int i=5; i<20; i=i+2) {
            System.out.println("hot summer"+i);
        }

        for(int i=10; i>0; i=i-2) {
            System.out.println("웩스바리"+i);
        }
    }
}
