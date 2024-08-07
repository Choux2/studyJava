package study0803;

public class Test76_2 {
    public static void main(String[] args) {
        Calculator2 c1 = new Calculator2();
        c1.setOperands(10,20);
        c1.sum();

        Calculator2 c2 = new Calculator2();
        c2.setOperands(20,40);
        c2.sum();

        Calculator2.base = 10;

        c1.sum();
        c2.sum();
    }
}

class Calculator2 {
    static double PI = 3.14;
    static int base = 0;
    int left, right;

    public void setOperands(int left, int right) {
        this.left = left;
        this. right = right;
    }

    public void sum(){
        System.out.println(this.left + this.right + base);
    }

    public void avg() {
        System.out.println((this.left + this.right + base)/2);
    }
}
