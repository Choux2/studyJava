package study0805;

public class Test86_2 {
    public static void main(String[] args) {
        DivisionableCal c1 = new DivisionableCal();
        c1.setOperands(10,20);
        c1.sum();
        c1.avg();
        c1.mul();
        c1.div();
    }
}

class DivisionableCal extends MultiplicationableCal {
    public void div() {
        System.out.println(this.left/this.right);
    }
}