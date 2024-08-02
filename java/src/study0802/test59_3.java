package study0802;

public class test59_3 {
    public static String getMember1() {
        return "양궁";
    }

    public static String getMember2() {
        return "탁구";
    }

    public static String getMember3() {
        return "배드민턴";
    }

    public static String[] getMembers() {
        String [] members = {"양궁", "탁구", "배드민턴"};
        return members;
    }

    public static void main(String[] args) {
//        System.out.println(getMember1());
//        System.out.println(getMember2());
//        System.out.println(getMember3());
        String[] members = getMembers();
        System.out.println(members[0]);
    }
}
