package Psub5;

import java.util.Scanner;

public class khj {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력하세요 : ");
        String name = sc.nextLine(); 
        System.out.print("학번을 입력하세요 : ");
        String studentID = sc.next(); 
        System.out.print("학과를 입력하세요 : ");
        String major = sc.next();

        System.out.println("<출력>");
        System.out.println("이름: " + name);
        System.out.println("학번: " + studentID);
        System.out.println("학과: " + major);


	}
}
