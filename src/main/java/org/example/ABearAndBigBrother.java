package org.example;

import java.util.Scanner;

public class ABearAndBigBrother {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = 0;
        int lw = s.nextInt();
        int bw = s.nextInt();
        while(lw<=bw){
            lw=lw+lw+lw;
            bw=bw+bw;
            x++;
        }
        System.out.println(x);
    }


}
