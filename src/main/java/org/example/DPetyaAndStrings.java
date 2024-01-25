package org.example;

import java.util.Scanner;

public class DPetyaAndStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String s2 = scanner.next();
        int diff = s.toUpperCase().compareTo(s2.toUpperCase());
//        if(s.length()==s2.length()) {
//            for (int i = 0; i < s.length(); i++) {
//                if (s.toUpperCase().charAt(i) > s2.toUpperCase().charAt(i)) {
//                    diff++;
//                    break;
//                } else if (s.toUpperCase().charAt(i) < s2.toUpperCase().charAt(i)) {
//                    diff--;
//                    break;
//                }
//            }
//        }
        if(diff>0){
            System.out.println(1);
        } else if (diff<0){
            System.out.println(-1);
        } else
        System.out.println(0);

    }


}
