package org.example;

import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class AAntonAndLetters {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            str = str.replace("{","");
            str = str.replace("}","");
//            str = str.substring(1, str.length() - 1);
            if(str.length()==0){
                System.out.println(0);
            } else {
                String[] chars = str.split(", ");

                Set<Character> disChars = new HashSet<>();

                for (String l : chars) {
                    disChars.add(l.charAt(0));
                }

                System.out.println(disChars.size());
            }
        }


}
