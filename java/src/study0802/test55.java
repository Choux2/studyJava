package study0802;

public class test55 {
    //메소드 정의
    public static void numbering(){
        int i = 0;
        while (i<10) {
            System.out.println(i);
            i++;
        }
    }

    public static void main(String[] args) {
        numbering(); //메소드 호출
        numbering();
        numbering();
    }
}
