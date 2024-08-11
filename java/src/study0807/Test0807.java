package study0807;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import static java.awt.SystemColor.menu;

public class Test0807 {

    public static void main(String[] args) {

        // main 시작

//        MegaCoffee bevarage = new MegaCoffee();

        int total = 0;

        // 음료 list 5개 이상 메뉴 add
        List<MegaCoffee> cafelist = new ArrayList<MegaCoffee>();
        MegaCoffee americano = new MegaCoffee();
        americano.setType("커피");
        americano.setName("아메리카노");
        americano.setHot("핫");
        americano.setPrice(1000);

        MegaCoffee vanila = new MegaCoffee();
        vanila.setType("커피");
        vanila.setName("바닐라라떼");
        vanila.setHot("아이스");
        vanila.setPrice(2000);

        MegaCoffee tea = new MegaCoffee();
        tea.setType("차");
        tea.setName("아이스티");
        tea.setPrice(1500);

        MegaCoffee ade = new MegaCoffee();
        ade.setType("에이드");
        ade.setName("자몽에이드");
        ade.setPrice(3000);

        MegaCoffee macaron = new MegaCoffee();
        macaron.setType("베이커리");
        macaron.setName("마카롱");
        macaron.setPrice(500);

        cafelist.add(americano);
        cafelist.add(vanila);
        cafelist.add(tea);
        cafelist.add(ade);
        cafelist.add(macaron);

//        cafelist.add(new MegaCoffee("커피", "아메리카노", "핫", 2000));
//        cafelist.add(new MegaCoffee("커피", "바닐라라떼", "아이스", 3500));
//        cafelist.add(new MegaCoffee("차", "아이스티", "아이스", 2500));
//        cafelist.add(new MegaCoffee("에이드", "자몽에이드", "아이스", 3000));
//        cafelist.add(new MegaCoffee("베이커리", "마카롱", "", 1500));

        // 메뉴판 출력
        System.out.println("메가커피에 오신걸 환영합니다 ☕️");
        for (MegaCoffee menu : cafelist) {
            System.out.println(menu);
        }

        // 주문 스캐너 반복
        Scanner sc = new Scanner(System.in);
        String inputMenu;
        String sum;

        while(true) {
            System.out.print("메뉴를 선택하세요: ");
            inputMenu = sc.next();

            while (!inputMenu.equals("아메리카노") && !inputMenu.equals("바닐라라떼") && !inputMenu.equals("아이스티")
                    && !inputMenu.equals("자몽에이드") && !inputMenu.equals("마카롱") && !inputMenu.equals("주문")) {
                System.out.print("메뉴를 다시 선택하세요: ");
                inputMenu = sc.next();
            }

            if (inputMenu.equals("아메리카노")) {
//            System.out.println(cafelist.get(0));
                MegaCoffee c = cafelist.get(0);
                total += c.getPrice();
            } else if (inputMenu.equals("바닐라라떼")) {
//            System.out.println(cafelist.get(1));
                MegaCoffee c = cafelist.get(1);
                total += c.getPrice();
            } else if (inputMenu.equals("아이스티")) {
//            System.out.println(cafelist.get(2));
                MegaCoffee c = cafelist.get(2);
                total += c.getPrice();
            } else if (inputMenu.equals("자몽에이드")) {
//            System.out.println(cafelist.get(3));
                MegaCoffee c = cafelist.get(3);
                total += c.getPrice();
            } else if (inputMenu.equals("마카롱")) {
//            System.out.println(cafelist.get(4));
                MegaCoffee c = cafelist.get(4);
                total += c.getPrice();
            } else if (inputMenu.equals("주문")) {
                System.out.println("주문금액: "+total);
                break;
            }
        }


        // 총 금액 영수증

        // 종료

    }
}
