package study0803;

public class Test72_calculator {

    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        //Caㅣculator라는 객체를 새로 만들기~
        //c1이라는 변수에 담기(인스턴스:구체적인 객체)-데아터형은 그 객체의 이름을 가지고 있어야
        //(cal~어쩌구라는 객체를 담을 수 있는 데이터 형식을 가진 변수여야 하기 때문)
        c1.setOperands(10, 20);
        c1.sum();
        c1.avg();

        Calculator c2 = new Calculator();
        c2.setOperands(20, 40);
        c2.sum();
        c2.avg();
    }
}

class Calculator {

    int left, right;
    static double PI = 3.14;
    // static - 이 변수가 이 클래스에 속한다
    // 클래스변수 - 모든 메소드/인스턴스에서 동일한 값을 갖는다

    public void setOperands(int left, int right) {
        this.left = left;
        this.right = right;
        //this. -  클래스를 구체적인 제품으로 만든 인스턴스를 가리키는 것
        //인스턴스 자신을 의미
    }

    public void sum() {
        System.out.println(this.left+this.right);
    }

    public void avg() {
        System.out.println(this.left+this.right/2);
    }
}
