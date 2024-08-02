package study0801;

import java.util.ArrayList;
import java.util.List;

public class test52 {
    public static void main(String[] args) {
        String[] members = {"붐바슈슈", "신나리슈슈", "블노깡"};
        for (String e : members ) {
            // : 뒤에 따라오는 배열데이터 값들을 반복문이 동작할 때 마다 하나씩 꺼냄
            System.out.println(e + " 일퀘완료!");
        }

        List<String> testList = new ArrayList<>();
        testList.add("a");
        testList.add("b");
        testList.add("c");

        for(int i=0; i<testList.size(); i++) {
            System.out.println(testList.get(i));
        }
        testList.remove(1);

        for(String test : testList) {
            System.out.println(test);
        }


    }
}
