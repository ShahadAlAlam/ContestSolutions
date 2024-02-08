package org.example;

import java.util.Scanner;

public class CSoldierAndBananas {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = 0;
        int k = s.nextInt();
        int n = s.nextInt();
        int w = s.nextInt();
        for(int i=1; i<=w ; i++){
            x=x+(k*i);
        }
        if((x-n)>0) {
            System.out.println(x - n);
        } else
            System.out.println(0);
    }


}
