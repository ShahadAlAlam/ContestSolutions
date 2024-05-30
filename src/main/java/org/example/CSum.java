package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class CSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        for(int j=0;j<testCases;j++) {
            int[] data = new int[3];
            for (int i = 0; i < 3; i++) {
                data[i] = sc.nextInt();
            }
            Arrays.sort(data);
            if (data[0] + data[1] == data[2]) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
