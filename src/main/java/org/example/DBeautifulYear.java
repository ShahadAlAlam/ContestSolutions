package org.example;

import java.util.HashSet;
import java.util.Scanner;

public class DBeautifulYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n =scanner.nextInt();
        String ans = "";
        boolean found = false;
        for(int j=n+1;j<=9000 && found!=true && j>=1000;j++) {
            ans = String.valueOf(j);
            HashSet<String> str = new HashSet<>();
            found = true;
            for(int i=0;i<4;i++){
                if(str.contains(String.valueOf( ans.charAt(i)))){
                    found =false;
                    break;
                } else
                    str.add(String.valueOf( ans.charAt(i)));
            }
        }
        if(found)
            System.out.println(Integer.parseInt(ans)+n);
        else System.out.println("");

    }
}
