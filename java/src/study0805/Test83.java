package study0805;

public class Test83 {
    public static void main(String[] args) {
        Calculator c1 = new Calculator(10, 20);
        c1.sum();
        c1.avg();

        Calculator c2 = new Calculator(20, 40);
        c2.sum();
        c2.avg();
    }
}

class Calculator {
    int left, right;

    //생성자 - 클래스가 생성될 때, 클래스와 같은 이름의 생성자가 가장 먼저 실행됨!!
    public Calculator(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void sum() {
        System.out.println(this.left + this.right);
    }

    public void avg() {
        System.out.println((this.left + this.right)/2);
    }
}

