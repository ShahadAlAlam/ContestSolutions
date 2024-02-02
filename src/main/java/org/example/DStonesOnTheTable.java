package org.example;

import java.util.Scanner;

public class DStonesOnTheTable {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int inputLen = s.nextInt();
        int pullStone = 0;
        String str = s.next();
        if(inputLen>0)
        for(int i = 1;i<inputLen;i++){
            if(str.charAt(i-1)==str.charAt(i)){
                pullStone++;
            }
        }
        System.out.println(pullStone);
    }


}
