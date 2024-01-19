package org.example;

import java.util.Scanner;

public class BeforeAnExamB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int sumHour = sc.nextInt();
        int[][] minMax = new int[d][3];
        int sumMinHour = 0;
        int sumMaxHour = 0;
        for (int i=0; i<d;i++) {
            minMax[i][0] = sc.nextInt();
            minMax[i][1] = sc.nextInt();
            sumMinHour += minMax[i][0];
            sumMaxHour += minMax[i][1];
            minMax[i][2] = minMax[i][0];
        }

        if(sumHour>=sumMinHour && sumHour<=sumMaxHour){
            sumHour -=sumMinHour;
//            System.out.println("YES");
            int k = 0;
            while (sumHour>0){
                if(sumHour - (minMax[k][1]-minMax[k][0])>=0){
//                    System.out.printf(String.valueOf(minMax[k][2] + (minMax[k][1]-minMax[k][0]))+" ");
                    minMax[k][2] = minMax[k][2] + (minMax[k][1]-minMax[k][0]);
                    sumHour -=(minMax[k][1]-minMax[k][0]);
                } else {
//                    System.out.printf(String.valueOf(minMax[k][2] + sumHour)+" ");
                    minMax[k][2] = minMax[k][2] + sumHour;
                    sumHour=0;
                }
                k++;
                if(k>=d){
                    k=0;
                }
            }
            System.out.println("YES");
            for (int i=0; i<d;i++){
                System.out.printf(String.valueOf(minMax[i][2])+" ");
            }
        } else {
            System.out.println("NO");
        }


    }
}
