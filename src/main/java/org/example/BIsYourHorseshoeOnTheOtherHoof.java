package org.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class BIsYourHorseshoeOnTheOtherHoof {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int check = 0;
        HashSet<Integer> res = new HashSet<>();

        int s1 = sc.nextInt();
        res.add(s1);
        s1 = sc.nextInt();
        if(res.contains(s1)){
            check+=1;
        }
        res.add(s1);
        s1 = sc.nextInt();
        if(res.contains(s1)){
            check+=1;
        }
        res.add(s1);
        s1 = sc.nextInt();
        if(res.contains(s1)){
            check+=1;
        }
        res.add(s1);

        System.out.println(check);
    }


}
