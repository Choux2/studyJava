package study0730;

public class test34 {
    public static void main(String[] args) {
        //비교연산자 ==
        System.out.println(1==2);
        System.out.println(1==1);
        System.out.println("one"=="two");
        System.out.println("one"=="one");

        //!=
        System.out.println(1!=2);
        System.out.println(1!=1);
        System.out.println("one"!="two");
        System.out.println("one"!="one");

        //><
        System.out.println(10>20);
        System.out.println(10>2);
        System.out.println(10>10);

        //>= <=
        System.out.println(10>=20);
        System.out.println(10>=2);
        System.out.println(10>=10);

        //.equals (문자열비교)
        String a = "Hello world";
        String b = new String ("Hello world");
        System.out.println(a == b);
        System.out.println(a.equals(b)); //.앞의 값과 ()안의 값 비교

    }
}
