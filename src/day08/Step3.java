package day08;

import java.util.Scanner;

public class Step3 {

    public static void main(String[] args) {

        

        // 0. 기본 생성자로 객체 생성
        Korean k3 = new Korean();
        System.out.println("k3 = " + k3);
        k3.name = "이자바";
        k3.ssn = "800423-1234567";
        System.out.println("k3 = " + k3);

        // 1. 정의된 생성자로 객체 생성
        Korean k1 = new Korean("박자바" , "011225-1234567");
        System.out.println(k1);

        Korean k2 = new Korean("김자바" , "930525-0654321");
        System.out.println("k2 = " + k2);


        
    }// m e

} // c e
