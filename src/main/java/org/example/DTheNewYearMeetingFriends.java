package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DTheNewYearMeetingFriends {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] j = new int[3];
        for(int i=0;i<3;i++){
            j[i]= sc.nextInt();
        }
        sc.close();
        Arrays.sort(j);
        int res = (j[1]-j[0])+(j[2]-j[1]);
        System.out.println(res);
    }
}
