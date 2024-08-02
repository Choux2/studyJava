package study0801;

public class test0801 {

    public static void main(String[] args) {

//        int result = plus(3);
//        System.out.println(result);

//        gugudan();
//
//        star1();
//        String str = star1_1();
//        System.out.println(str);

//        star2();
//        star3();
        star4();


    }
    // f(x) = x+1;
    // f(2)
    private static int plus(int a){
        int result;
        result = a +1;
        return result;
    }

    private static void gugudan(){
        for(int i=1; i<10; i++){
            for(int j=1; j<10; j++)
            {
                System.out.println(i+"x"+j+"="+i*j);
            }
        }
    }

    private static void star1(){
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static String star1_1(){
        String str  = "";
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++) {
                str += "*";
            }
            str += "\n";
        }
        return str;
    }


    private static void star2(){
        for(int i=5; i>0; i--){
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    private static void star3(){
        for(int i=1; i<=5; i++){
            for(int k=1; k<=5-i; k++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void star4(){
        int i = 1;

        while(i<=5){
            int j = 1;
            int k = 1;

            while(k<=5-i){
                System.out.print(" ");
                k++;
            }
            while(j<=i)
            {
                System.out.print("*");
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
