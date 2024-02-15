package org.example;

import java.util.Scanner;

public class AWrongSubtraction {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int len = s.nextInt();
        for(int i=0; i<len; i++){
            if(String.valueOf(x).charAt(String.valueOf(x).length()-1)!='0'){
                x=x-1;
            } else {
                x=(int) x/10;
            }
        }
        System.out.println(x);
    }


}
