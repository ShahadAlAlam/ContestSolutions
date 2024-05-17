package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BAmusingJoke {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String gN = sc.nextLine();
        String hN = sc.nextLine();
        String mixedLatter = sc.nextLine();
        sc.close();
        Map<Character, Integer> gNCharCnt = new HashMap<>();
        ;
        for (char ch : gN.toCharArray()) {
            gNCharCnt.put(ch, gNCharCnt.getOrDefault(ch, 0) + 1);
        }

        Map<Character, Integer> hNCharCnt = new HashMap<>();
        ;
        for (char ch : hN.toCharArray()) {
            hNCharCnt.put(ch, hNCharCnt.getOrDefault(ch, 0) + 1);
        }

        Map<Character, Integer> mixedLatterCharCnt = new HashMap<>();
        ;
        for (char ch : mixedLatter.toCharArray()) {
            mixedLatterCharCnt.put(ch, mixedLatterCharCnt.getOrDefault(ch, 0) + 1);
        }

        boolean canFormNames = true;
        for (char letter : gNCharCnt.keySet()) {
            if ((!mixedLatterCharCnt.containsKey(letter)) || (mixedLatterCharCnt.get(letter) < gNCharCnt.getOrDefault(letter, 0) + hNCharCnt.getOrDefault(letter, 0))) {
                canFormNames = false;
                break;
            }
        }

        if (canFormNames) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

}


