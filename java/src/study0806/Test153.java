package study0806;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Test153 {
    //List 내가 입력한 모든 값을 순서대로 저장 (중복 가능)
    //Set 중복값은 제외하고 고유한 값들만 저장 (순서 상관 x)
    public static void main(String[] args) {
        HashSet<Integer> A = new HashSet<Integer>();
        A.add(1);
        A.add(2);
        A.add(2);
        A.add(2);
        A.add(2);
        A.add(3);

        Iterator hi = (Iterator) A.iterator();
        while (hi.hasNext()) {
            System.out.println(hi.next());
        }

        //hasNext 반복 할 데이터가 있으면 true, 더 이상 반복할 데이터가 없다면 false 리턴
        //next hasNext가 true라는 것은 next가 리턴할 데이터가 존재한다는 의미

        ArrayList<Integer> B = new ArrayList<>();
        B.add(1);
        B.add(2);
        B.add(2);
        B.add(2);
        B.add(2);
        B.add(3);

        Iterator ai = (Iterator) B.iterator();
        while (ai.hasNext()) {
            System.out.println(ai.next());
        }
    }
}
