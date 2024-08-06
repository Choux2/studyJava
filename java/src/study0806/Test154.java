package study0806;

import java.util.HashSet;
import java.util.Iterator;

public class Test154 {
    public static void main(String[] args) {
        //Set - 집합의 프로그래밍화!!
        HashSet<Integer> A = new HashSet<Integer>();
        A.add(1);
        A.add(2);
        A.add(3);

        HashSet<Integer> B = new HashSet<Integer>();
        B.add(3);
        B.add(4);
        B.add(5);

        HashSet<Integer> C = new HashSet<Integer>();
        C.add(1);
        C.add(2);

        //containsAll - 부분집합
        System.out.println(A.containsAll(B)); //false: B는 A의 부분집합이 아니다
        System.out.println(A.containsAll(C)); //true: C는 A의 부분집합이다

//        A.addAll(B); //합집합(A∪B)
//        A.retainAll(B); //교집합(A∩B)
//        A.removeAll(B); //차집합(A-B)

        Iterator hi = (Iterator) A.iterator();
        while(hi.hasNext()) {
            System.out.println(hi.next());
        }
    }
}
