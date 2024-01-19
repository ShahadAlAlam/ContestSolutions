package org.example;

import java.io.IOException;
import java.util.Scanner;

public class NextRoundD {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int[] constResult = new int[a];
        for(int j = 0 ; j<a;j++){
            constResult[j] = scanner.nextInt();
        }

        int participent = 0 ;
        for (int j = 0 ; j<a;j++){
            if(constResult[j]>=constResult[b-1] && constResult[j]>=1){
                participent++;
            }
        }
        System.out.println(participent);

    }
}
