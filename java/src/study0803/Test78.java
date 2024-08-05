package study0803;

public class Test78 {
    public static void main(String[] args) {
        C1 c = new C1();

//        c.static_static();
//        c.static_instance();
//        c.instance_static();
//        c.instance_instance();

//        C1.static_static();
//        C1.static_instance();
//        C1.instance_static();
//        C1.instance_instance();

    }
}

class C1 {
    static int static_variale = 1; //클래스변수
    int instance_variable = 2; //인스턴스변수

    static void static_static() { //클래스 메소드가 클래스 변수를 호출
        System.out.println(static_variale);
    }
    static void static_instance() {
//        System.out.println(instance_variable);
    }
    void instance_static() {
        System.out.println(static_variale);
    }
    void instance_instance() {
        System.out.println(instance_variable);
    }
}