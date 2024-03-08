package org.example;

import java.util.Scanner;

public class DDivisibilityProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s1 = sc.nextInt();
        if (s1>0) {
            for (int i = 1; i <= s1; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = 0;
                if(a%b==0){
                    System.out.println(0);

                }
                else if (a > b)
                    System.out.println(b-(a % b));
                else
                    System.out.println((b - a));
            }
        }
    }


}
