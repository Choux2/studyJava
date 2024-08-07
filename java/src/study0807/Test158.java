package study0807;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test158 {
    public static void main(String[] args) {
        HashMap<String, Integer> a = new HashMap<String, Integer>();
        a.put("one", 1);
        a.put("two", 2);
        a.put("three", 3);
        a.put("four", 4);
        System.out.println(a.get("one"));
        System.out.println(a.get("two"));
        System.out.println(a.get("three"));

        iteratorUsingForEach(a);
        iteratorUsingIterator(a);
    }

    static void iteratorUsingForEach(HashMap map) {
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        //Set 데이터 타입의 리턴된 어떤 객체가 entries라고 하는 변수에 담김
        //Map 인터페이스의 Entry인터페이스를 구현하고 있는 어떠한 객체가 Map에 대응되는 Set컨테이너 안에 들어감
        //Map.Entry<getKey()데이터타입, getValue()데이터타입>
        for (Map.Entry<String, Integer> entry : entries) { //Set데이터타입의 entries 데이터를 하나한 꺼내서 entry에 담기
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    static void iteratorUsingIterator(HashMap map) {
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        Iterator<Map.Entry<String, Integer>> i = entries.iterator();
        while(i.hasNext()) {
            Map.Entry<String, Integer> entry = i.next();
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}

