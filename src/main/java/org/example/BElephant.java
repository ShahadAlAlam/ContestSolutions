package org.example;

import java.util.Scanner;

public class BElephant {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = 0;
        int bw = s.nextInt();
        while(bw>0){
            bw = bw-5;
            x++;
        }
        System.out.println(x);
    }


}
