package study0807;


import java.util.*;

class Computer implements Comparable {
    int serial;
    String owner;
    Computer(int serial, String owner) {
        this.serial = serial;
        this.owner = owner;
    }

    public int compareTo(Object o) {
        return this.serial - ((Computer)o).serial;
    }
    //(a.compareTo(b) 현재 객체 a와 compareTo를 실행했을 때 b로 전달된 객체 비교
    //return a.serial - b.serial    a>b 양수 a=b 0 a<b 음수

    public String toString() {
        return serial+" "+owner;
    }
}

public class Test159 {
    public static void main(String[] args) {
        List<Computer> computers = new ArrayList<Computer>();
        computers.add(new Computer(500, "egoing"));
        computers.add(new Computer(200, "leezche"));
        computers.add(new Computer(3233, "graphittie"));
        Iterator i = computers.iterator();
        System.out.println("before");
//        while(i.hasNext()) {
//            System.out.println(i.next());
//        }
        for (Computer c : computers) {
            System.out.println(c);
        }


        Collections.sort(computers);
        System.out.println("\nafter");
        i = computers.iterator();
        while(i.hasNext()) {
            System.out.println(i.next());
        }

    }
}
