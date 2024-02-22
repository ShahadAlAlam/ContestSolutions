package org.example;

import java.util.Scanner;

public class ATram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ansMax = 0;
        int curPassenger = 0;
        int n =scanner.nextInt();
        int[][] stops = new int[n][2];
        for (int i = 0; i < n; i++) {
            stops[i][0] =scanner.nextInt();
            stops[i][1] =scanner.nextInt();
        }

        for (int[] stop : stops) {
            int inPassenger = stop[0];
            int outPassenger = stop[1];
            curPassenger -= inPassenger;
            curPassenger += outPassenger;
            ansMax = Math.max(ansMax, curPassenger);
        }
        System.out.println(ansMax);
    }
}
