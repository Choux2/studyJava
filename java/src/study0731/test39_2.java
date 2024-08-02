package study0731;

public class test39_2 {
    public static void main(String[] args) {
        System.out.println("switch(1)");
        switch (1) {
            case 1 :
                System.out.println("one");
                break; //실행 종류 후 switch문 밖으로~~
            case 2 :
                System.out.println("two");
                break;
            case 3 :
                System.out.println("three");
                break;
        }

        System.out.println("switch(2)");
        switch (2) {
            case 1 :
                System.out.println("one");
                break;
            case 2 :
                System.out.println("two");
                break;
            case 3 :
                System.out.println("three");
                break;
        }

        System.out.println("switch(3)");
        switch (3) {
            case 1 :
                System.out.println("one");
                break;
            case 2 :
                System.out.println("two");
                break;
            case 3 :
                System.out.println("three");
                break;
        }

        int val = 1;
        if(val == 1){
            System.out.println("one");
        } else if (val == 2) {
            System.out.println("two");
        } else if (val == 3) {
            System.out.println("three");
        }

        System.out.println("switch(4)");
        switch (4) {
            case 1 :
                System.out.println("one");
                break; //실행 종류 후 switch문 밖으로~~
            case 2 :
                System.out.println("two");
                break;
            case 3 :
                System.out.println("three");
                break;
            default: //부여한 조건이 케이스 어디에도 일치하지 않는 경우
                System.out.println("default");
        }

    }
}
