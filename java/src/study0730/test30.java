package study0730;

public class test30 {
    public static void main(String[] args) {

        int result = 1+2;
        System.out.println(result); //3

        result = result -1;
        System.out.println(result); //2

        result = result *2;
        System.out.println(result); //4

        result = result /2;
        System.out.println(result); //2

        result = result +8;
        System.out.println(result); //10

        result = result % 7; // 10을 7로 나눴을 때의 나머지
        System.out.println(result); //3

        //나머지 연산자
        int a = 3;
        System.out.println(0%a);
        System.out.println(1%a);
        System.out.println(2%a);
        System.out.println(3%a);
        System.out.println(4%a);
        System.out.println(5%a);
        System.out.println(6%a);

        //문자 결합
        String firstString = "This is";
        String secondString = " a concatenated string";
        String thirdString = firstString + secondString;
        System.out.println(thirdString);
    }
}
