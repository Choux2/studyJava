package study0806;

import java.util.ArrayList;

public class Test151 {
    public static void main(String[] args) {
        //배열 선언 시 개수를 지정해야하고,그 개수보다 더 많은 값을 지정하게되면 오류 발생!!
        String[] arrayObj = new String[2];
        arrayObj[0] = "one";
        arrayObj[1] = "two";
        //arrayObj[2] = "three"; 오류발생

        for(int i=0; i<arrayObj.length; i++) {
            System.out.println(arrayObj[i]);
        }

        //ArrayList 배열과 비슷한 일처리, 개수 지정 x
        ArrayList al = new ArrayList();
        //데이터 추가
        al.add("one"); //.add- 어떠한 형태의 데이터 타입도 수용가능
        al.add("two");
        al.add("three");
        //인자의 데이터 타입이 object여야 함 - Arraylist 내부에 저장될 때 object 형식으로 저장
        for(int i=0; i<al.size(); i++) {
//            String value = al.get(i); 오류 발생!!
//            인덱스 값들은 현재 object 타입이기 때문에 담고자 하는 데이터타입으로 형변환 필요
            String value = (String)al.get(i);
            System.out.println(al.get(i));
        }

        ArrayList<String> al2 = new ArrayList<String>(); //제네릭을 통해 데이터 타입 미리 지정
        al2.add("1");
        al2.add("2");
        al2.add("3");
        for(int i=0; i<al.size(); i++) {
            String value = al2.get(i); //따로 형변환 필요 x
            System.out.println(al2.get(i));
        }
    }
}
