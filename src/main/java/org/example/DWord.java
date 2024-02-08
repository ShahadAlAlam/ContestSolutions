package org.example;

import java.util.Scanner;

public class DWord {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        if(str.replaceAll("[A-Z]","").length()>str.replaceAll("[a-z]","").length()){
            System.out.println(str.toLowerCase());
        } else if (str.replaceAll("[A-Z]","").length()<str.replaceAll("[a-z]","").length()){
            System.out.println(str.toUpperCase());
        } else {
            System.out.println(str.toLowerCase());
        }
    }


}
