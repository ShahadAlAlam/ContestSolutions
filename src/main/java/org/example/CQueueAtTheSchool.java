package org.example;

import java.util.Scanner;

public class CQueueAtTheSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n =scanner.nextInt();
        int s =scanner.nextInt();
        String l = scanner.next();
        for(int j=0;j<s ;j++) {
         l=  l.replaceAll("BG","GB");
        }
        System.out.println(l);
    }
}
