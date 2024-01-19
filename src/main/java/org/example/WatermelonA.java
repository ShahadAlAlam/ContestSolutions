package org.example;

public class WatermelonA {
    public void getResult(int weight){
        if(weight>0)
            if(chkResult( weight))
                System.out.println("YES");
            else
        System.out.println("No");
        else
            System.out.println("NO");
    }
    public boolean chkResult(int weight){
        boolean res = true;
        if(weight>=2) {
            if (weight % 2 == 0) {
                res = chkResult(weight/2);
            }
            else
                res = false;
        } else
            res = true;
        return res;
    }
}
