package org.example;

import java.util.Scanner;

public class AVasyaTheHipster {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int redSocks = sc.nextInt();
            int blueSocks = sc.nextInt();
            sc.close();
            System.out.println(Math.min(redSocks,blueSocks)+" "+((redSocks+blueSocks - (Math.min(redSocks,blueSocks)*2))/2));
        }
}
