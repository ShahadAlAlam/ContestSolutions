package org.example;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AIWannaBeTheGuy {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int len = s.nextInt();
        int xMax = s.nextInt();
        Set<Integer> x = new HashSet<>();
        Set<Integer> y = new HashSet<>();
        for(int i=0; i<xMax; i++){
            x.add(s.nextInt());
        }
        int yMax = s.nextInt();
        for(int j=0; j<yMax; j++){
            y.add(s.nextInt());
        }

        x.addAll(y);
        boolean res = false;
        for(int i=1; i<=len; i++){
            if(x.contains(i)){
                res = true;
            } else {
                res = false;
                break;
            }
        }
        if (res) {
            System.out.println("I become the guy.");
        } else {
            System.out.println("Oh, my keyboard!");
        }

    }


}
