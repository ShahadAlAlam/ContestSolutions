package org.example;

import java.util.Scanner;

public class DAgainTwentyFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long res = sc.nextLong();
        if(res>=2 && res<=2100000000000000000D)
        System.out.println(25);
        sc.close();
    }
}
