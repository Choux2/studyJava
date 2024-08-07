package study0807;

import java.util.*;

public class Test157 {
    public static void main(String[] args) {
        //Map key 중복x value 중복o
        HashMap<String, Integer> a = new HashMap<String, Integer>();
        //List/Set은 value만 저장 - 저장될 값에 해당되는 데이터 타입만 지정하면 됨
        //Map은 key와 value 두가지의 데이터타입 지정 필요

        a.put("one", 1); //(key, value) 데이터 추가
        a.put("two", 2);
        a.put("three", 3);
        a.put("four", 4);
        System.out.println(a.get("one")); //key값 입력해서 value 가져오기
        System.out.println(a.get("two"));
        System.out.println(a.get("three"));

    }
}
