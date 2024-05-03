package org.example;

import java.util.Scanner;

public class DGames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] ownUniform = new int[n];
        int[] outsideUniform = new int[n];

        for (int i = 0; i < n; i++) {
            ownUniform[i] = sc.nextInt();
            outsideUniform[i] = sc.nextInt();
        }

        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && ownUniform[i] == outsideUniform[j]) {
                    res++;
                }
            }
        }

        System.out.println(res);
    }
}
