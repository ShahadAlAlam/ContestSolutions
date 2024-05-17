package org.example;

import java.util.Scanner;

public class AILoveUsername {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] points = new int[n];
        for (int i = 0; i < n; i++) {
            points[i] = sc.nextInt();
        }

        int res = 0;
        int maxPoint = points[0];
        int minPoint = points[0];
        for (int i = 1; i < n; i++) {
            if (points[i] > maxPoint) {
                maxPoint = points[i];
                res++;
            } else if (points[i] < minPoint) {
                minPoint = points[i];
                res++;
            }
        }
        System.out.println(res);
    }
}
