package study0802;

public class test57 {

    public static void numbering (int limit) {
        int i = 0;               //매개변수(parameter) - 입력값을 수용하기 위한 변수가 정의되어 있는 부분
        while (i<limit) {
            System.out.println(i);
            i++;
        }
    }

    public static void main(String[] args) {
//        numbering(5); //인자(argument)
//        numbering(3);



        test55 test55 = new test55();
        study0802.test55.test55_2 test = new test55.test55_2();
        System.out.println(test.i);
    }
}
