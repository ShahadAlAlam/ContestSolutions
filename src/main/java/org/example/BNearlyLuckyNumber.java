package org.example;

import java.util.Scanner;

public class BNearlyLuckyNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(String.valueOf(n).replaceAll("[4|7]","").length()==0
        && (String.valueOf(n).replaceAll("[^4|^7]","").length()==4
        || String.valueOf(n).replaceAll("[^4|^7]","").length()==7)){
            System.out.println("YES");
        } else
            System.out.println("NO");

//        //working
//        int luckyDigitCount = 0;
//        while (n > 0) {
//            if (n % 10 == 4 || n % 10 == 7) {
//                luckyDigitCount++;
//            }
//            n /= 10;
//        }
//        if (luckyDigitCount == 4 || luckyDigitCount == 7) {
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }
    }
}
