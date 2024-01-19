package org.example;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        boolean res = false;
        while(a>2){
            if((a-2)%2==0){
                res = true;
                break;
            } else {
                a-=2;
            }
        }
        if(res){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

}
//        if(a>0){
//            if(a%2!=0){
//                System.out.println("NO");
//            } else if(((a/2)%2)==0 && ((a/2)>0) ){
//                System.out.println("YES");
//            }
//        } else
//            System.out.println("NO");
//    }
//
//}