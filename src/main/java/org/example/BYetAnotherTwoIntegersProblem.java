package org.example;

import java.util.Scanner;

public class BYetAnotherTwoIntegersProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        for (int i = 0; i < testCases; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int j = (Math.abs(a-b)+9)/10;
            System.out.println(j);
        }
        sc.close();
    }
}
