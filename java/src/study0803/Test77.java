package study0803;

public class Test77 {
    public static void main(String[] args) {
        Calculator3.sum(10,20);
        Calculator3.avg(10,20);

        Calculator3.sum(20,40);
        Calculator3.avg(20,40);

        //Cal4.sum(10,20);
        Cal4 c = new Cal4();
        c.sum(10, 20);
    }
}

class Calculator3 {
    //static으로 인해 클래스 소속의 메소드가 된다~
    //인스턴스 메소드와는 다르게 클래스에 직접 접근해서 실행 ㅇ
    public static void sum (int left, int right) {
        System.out.println(left+right);
    }

    public static void avg (int left, int right) {
        System.out.println(left+right/2);
    }
}

class Cal4 {
    public void sum(int left, int right) {
        System.out.println(left+right);
    }
}