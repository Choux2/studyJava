package study0806;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class Test156 {
    public static void main(String[] args) {
//        HashSet<Integer> A = new HashSet<Integer>();
//        ArrayList<Integer> A = new ArrayList<Integer>();
//        Collection<Integer> A = new HashSet<Integer>();
        Collection<Integer> A = new ArrayList<>();

        A.add(1);
        A.add(2);
        A.add(3);

        //컬렉션 인터페이스를 구현하고 있는 모든 클래스들이 공통적으로 가지고 있는 API
        //반복자?
        Iterator hi = A.iterator();
        while(hi.hasNext()) {
            System.out.println(hi.next());
            //.hasNext hi라는 이터레이터 안에 값이 존재하는지!! -> 존재한다면 true
            //.next 들어있는 값 중 하나를 리턴해줌 > 리턴한 이터레이터 안의 값은 사라짐 (찐 데이터값이 사라지는게 x)

        }
    }
}
