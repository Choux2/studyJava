package study0805;

public class Test85 {
    public static void main(String[] args) {
//        substractionableCal c1 = new substractionableCal();
//        c1.setOperands(10,20);
//        c1.sum();
//        c1.avg();
//        c1.min();

        //test 88
        substractionableCal c1 = new substractionableCal(10, 20);
        c1.sum();
        c1.avg();
        c1.min();
    }
}

class Calculator2 {
    int left, right;

    public void setOperands(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void sum() {
        System.out.println(this.left + this.right);
    }

    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}

class substractionableCal extends Calculator2 {
  //test88
   public substractionableCal(int left, int right) {
       this.left = left;
       this.right = right;
   }

    public void min() {
        System.out.println(this.left - this.right);
    }
}

