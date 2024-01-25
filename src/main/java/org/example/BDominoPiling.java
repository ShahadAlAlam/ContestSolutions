package org.example;

import java.util.Scanner;

public class BDominoPiling {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int width = s.nextInt();
        int height = s.nextInt();
        int dominoCount = 0;
        int area = width*height;
        if(width<2 && height <2){
            System.out.println(0);
        } else
        System.out.println((int) Math.floor(area/2) );

    }


}
