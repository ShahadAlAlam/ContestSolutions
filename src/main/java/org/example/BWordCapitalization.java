package org.example;

import java.util.Scanner;

public class BWordCapitalization {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        if(str.length()>0)
        System.out.println(str.substring(0,1).toUpperCase()+ (str.length()>1? str.substring(1,str.length()):""));
    }


}
