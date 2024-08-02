package study0802;

public class test58 {
                // 리턴값이 반드시 String
    public static String numbering(int init, int limit) {
       int i = init;
       String output = "";
       while (i < limit) {
           output += i; //output = output+i;
           i++;
       }
       return output; //메소드 종료. return 뒤에 오는 값을 메소드의 출력값으로 외부로 반환
    }

    public static void main(String[] args) {
        //void - 메소드의 리턴값은 존재하지 않는다고 명시적으로 선언
        String result = numbering(1,5);
        //리턴값을 받아야하기 때문에 반드시 같은 데이터타입으로...
        System.out.println(result);
    }
}
