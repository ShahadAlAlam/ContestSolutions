package org.example;

import java.util.Scanner;

public class BBuyAShovel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int r = sc.nextInt();
        sc.close();
        
        for (int res = 1; res <= 10; res++) {
            int totCost = res * k;
            if (totCost % 10 == 0 || totCost % 10 == r) {
                System.out.println(res);
                return;
            }
        }
    }
}
