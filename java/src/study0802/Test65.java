package study0802;

import java.io.*;
import java.util.Scanner;

public class Test65 {

    public static void main(String[] args) throws FileNotFoundException {
        //try ~ catch 예외
        try {
           File file = new File("out.txt");
           Scanner sc = new Scanner(file);
           while(sc.hasNextInt()) {
               System.out.println(sc.nextInt()*1000);
           }
           sc.close();
       } catch(FileNotFoundException e) {
           e.printStackTrace();
       } //원하는 파일을 찾을 수 없을 때 에러 내용을 화면에 표시해라~
    }
}
