package org.example;

import java.util.Scanner;

public class BArrivalOfTheGeneral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] solderHight = new int[n];

        for (int i = 0; i < n; i++) {
            solderHight[i] = sc.nextInt();
        }


        int maxHightPosition = 0;
        int minHightPosition = 0;

        for (int i = 0; i < n; i++) {
            if (solderHight[i] > solderHight[maxHightPosition]) {
                maxHightPosition = i;
            }
            if (solderHight[i] <= solderHight[minHightPosition]) {
                minHightPosition = i;
            }
        }

        int res = 0;
        res += maxHightPosition;
        res += (n - 1 - minHightPosition);

        if (minHightPosition < maxHightPosition) {
            res--;
        }

        System.out.println(res);
    }
}
