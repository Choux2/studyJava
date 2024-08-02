package study0801;

public class test50 {
    public static void main(String[] args) {
        String[] classGroup = {"붐바슈슈", "생쥐수염", "블노깡", "붐바용용"};
        System.out.println(classGroup[0]); //색인 index 첫번째가 0
        System.out.println(classGroup[1]);
        System.out.println(classGroup[2]);
        System.out.println(classGroup[3]);

        String[] classGroup2 = new String[4];
        classGroup2[0] = "붐바슈슈";
        System.out.println(classGroup2.length);
        //.length 배열이 담을 수 있는 원소의 개수

        classGroup2[1] = "생쥐수염";
        System.out.println(classGroup2.length);

        classGroup2[2] = "블노깡";
        System.out.println(classGroup2.length);

        classGroup2[3] = "붐바용용";
        System.out.println(classGroup2.length);

    }

}
