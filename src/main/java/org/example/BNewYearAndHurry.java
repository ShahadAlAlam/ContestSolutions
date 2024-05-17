package org.example;

import java.util.Scanner;

public class BNewYearAndHurry {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int k = sc.nextInt();
        if(l>0 && l<=10 && k>0 && k<=240) {
            int qumilative = 0;
            int i = 0;
            do {
                qumilative = qumilative + (i * 5);
                i++;
            } while ((qumilative + (i * 5) <= 240 - k) && i<=l);
            System.out.println(i - 1);
        } else {
            System.out.println(0);
        }
    }
}
