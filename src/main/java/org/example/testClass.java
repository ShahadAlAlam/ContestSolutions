package org.example;

import java.util.Scanner;
public class testClass {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                int n = sc.nextInt();
                int[] a = new int[n];
                for (int j = 0; j < n; j++) {
                    a[j] = sc.nextInt();
                }
                System.out.println(canReduceToOneElement(a) ? "YES" : "NO");
            }

            sc.close();
        }

        private static boolean canReduceToOneElement(int[] a) {
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            for (int num : a) {
                if (num < min) {
                    min = num;
                }
                if (num > max) {
                    max = num;
                }
            }

            return max - min <= 1;
        }

}
