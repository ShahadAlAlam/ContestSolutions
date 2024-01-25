package org.example;

import java.util.Scanner;

public class ABitPlusPlus {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = 0;
        int len = s.nextInt();
        String[] str = new String[len];
        for(int i=0;i<len;i++){
            String chk = s.next();
            if(chk.charAt(0)=='X' ){
                if(chk.charAt(1)=='+')
                    x++;
                else if (chk.charAt(1)=='-') {
                    x--;
                }
            } else if (chk.charAt(0)!='X'){
                if(chk.charAt(0)=='+')
                    ++x;
                else if (chk.charAt(0)=='-') {
                    --x;
                }
            }
        }
        System.out.println(x);
    }


}
