package org.example;

import java.util.Scanner;

public class CHulk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer("");
        int s1 = sc.nextInt();
        for(int i=1 ; i<=s1; i++){
            if(i==1){
                sb.append("I hate ");
            } else if((i%2)==0){
                sb.append(" I love ");
            } else {
                sb.append(" I hate ");
            }
            sb.append(i==s1?"it":"that");
        }

        System.out.println(sb.toString());
    }


}
