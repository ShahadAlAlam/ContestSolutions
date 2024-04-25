package org.example;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import java.util.*;

    public class CPangramChecker {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            sc.nextLine();
            String str = sc.nextLine().toLowerCase();

            Set<Character> characterSet = new HashSet<>();

            for (char ch : str.toCharArray()) {
                if (Character.isLetter(ch)) {
                    characterSet.add(ch);
                }
            }
            if (characterSet.size() == 26) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
    }
