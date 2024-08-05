package study0805;

public class Test86 {
    public static void main(String[] args) {
        MultiplicationableCal c1 = new MultiplicationableCal();
        c1.setOperands(10,20);
        c1.sum();
        c1.avg();
        c1.mul();
    }
}

class MultiplicationableCal extends Calculator2 {
    public void mul() {
        System.out.println(this.left * this.right);
    }
}