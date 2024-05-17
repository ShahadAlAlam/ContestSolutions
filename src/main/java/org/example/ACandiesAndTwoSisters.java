package org.example;

import java.util.Scanner;

public class ACandiesAndTwoSisters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int count = 0;
            int even = (n%2)==0? 1:0;
            for (int a = 1; a <= (n / 2)-even; a++) {
                int b = n - a;
                if ((a < b) && (a+b ==n) ) {
                    count++;
                }
            }

            // Print the number of ways for the current test case
            System.out.println(count);
        }
    }
}


