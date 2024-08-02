package study0801;

public class test45 {
    public static void main(String[] args) {
        for (int i=0; i<10; i++){
            if (i == 5)
                break; //반복문 종료
            //if 뒤에 조건이 한줄이면 중괄호 생략가능
            System.out.println("hot summer"+i);
        }
    }
}
