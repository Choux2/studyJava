package study0802;

public class test55 {

    public static void main(String[] args) {
//        numbering(); //메소드 호출
//        numbering();
//        numbering();


        test57 test57 = new test57();
        study0802.test57.numbering(1);

    }

    // 메소드 정의
    public static void numbering2(){
        int i = 0;
        while (i<10) {
            System.out.println(i);
            i++;
        }
    }


    public static class test55_2 {
        public int i = 3;

//        public void setI(int i) {
//            this.i = i;
//        }
//
//        public int getI() {
//            return i;
//        }
    }
}
