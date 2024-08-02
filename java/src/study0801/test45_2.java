package study0801;

public class test45_2 {
    public static void main(String[] args) {
        for (int i=0; i<10; i++){
            if (i == 5)
                continue; //멈추고 반복문 다시 실행
            System.out.println("hot summer" + i);
        }
    }
}
