package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class CRestoringThreeNumbers {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[] dataVal = new int[4];
            dataVal[0] = sc.nextInt();
            dataVal[1] = sc.nextInt();
            dataVal[2] = sc.nextInt();
            dataVal[3] = sc.nextInt();
            sc.close();
            Arrays.sort(dataVal);
            int numA= dataVal[3]-dataVal[2];
            int numB= dataVal[3]-dataVal[1];
            int numC= dataVal[3]-dataVal[0];

            System.out.println(numA+" "+numB+" "+numC);
        }
}
