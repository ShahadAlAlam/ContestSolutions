package org.example;

import java.util.Scanner;

public class APresents {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int[] m = new int[n];
            for (int i = 0; i < n; i++) {
                m[i] = scanner.nextInt();
            }

            int[] ans = new int[n];
            for (int i = 0; i < n; i++) {
                ans[m[i] - 1] = i + 1;
            }

            for (int i = 0; i < n; i++) {
                System.out.print(ans[i] + " ");
            }
        }
}
