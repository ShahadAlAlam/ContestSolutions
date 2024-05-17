package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class CSumOfRoundNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int testCase = sc.nextInt();
            int multiPlier = 1;
            ArrayList<Integer> testCaseValue = new ArrayList<>();
            while (testCase > 0) {
                int digit = testCase % 10;
                if (digit != 0) {
                    testCaseValue.add(digit * multiPlier);
                }
                testCase /= 10;
                multiPlier *= 10;
            }

            System.out.println(testCaseValue.size());
            for (int vals : testCaseValue) {
                System.out.print(vals + " ");
            }
            System.out.println();
        }
        sc.close();

    }
}
