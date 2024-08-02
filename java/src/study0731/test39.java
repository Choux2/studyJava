package study0731;

public class test39   {
    public static void main(String[] args) {
        System.out.println("switch(1)");
        switch (1) {  //일치하는 케이스 뒤의 모든 케이스들이 순차적으로 실행
            case 1 :
                System.out.println("one");
            case 2 :
                System.out.println("two");
            case 3 :
                System.out.println("three");
        }

        System.out.println("switch(2)");
        switch (2) {
            case 1 :
                System.out.println("one");
            case 2 :
                System.out.println("two");
            case 3 :
                System.out.println("three");
        }

        System.out.println("switch(3)");
        switch (3) {
            case 1 :
                System.out.println("one");
            case 2 :
                System.out.println("two");
            case 3 :
                System.out.println("three");
        }
    }
}
