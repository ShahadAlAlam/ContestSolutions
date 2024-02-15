package org.example;

import java.util.Scanner;

public class CAntonAndDanik {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        String str = scanner.next();
        if (str.replaceAll("A","").length() >
                str.replaceAll("D","").length()){
            System.out.println("Danik");
        } else if (str.replaceAll("A","").length() <
                str.replaceAll("D","").length()){
            System.out.println("Anton");
        } else
            System.out.println("Friendship");
    }
}
