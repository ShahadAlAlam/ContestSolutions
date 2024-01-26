package org.publicContest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class GetATree {
    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
        InputStreamReader reader = new InputStreamReader(System.in);

        BufferedReader sc = new BufferedReader(reader);
        List<DualValues> dvInput = new ArrayList<>();
        int indexOfDV = 0;
        int minVal = Integer.MAX_VALUE;
        int minNextVal = Integer.MAX_VALUE;
        String line="";
        List<String> vals = new ArrayList<>();
        boolean inputCheck = true;

        while(inputCheck)
        {
            inputCheck = (line = sc.readLine()).length()>0;
            if(line.length()<=0){
                break;
            }
            vals = Arrays.stream(line.split("[\\s+]")).toList();
            int i = Integer.parseInt(vals.get(0));
//            sc.next();
            int j = Integer.parseInt(vals.get(1));

            dvInput.add(new DualValues(i,j));
            if(i<minVal){
                minVal = i;
                minNextVal = j;
            }
        }
        List<DualValues> res = new ArrayList<>();
        int k = 0;
        res.add( new DualValues(minVal,minNextVal));
        for(int l = 0 ; l< dvInput.size(); l++){
            DualValues tempDv = res.get(k).getDV(dvInput, res.get(k).vn);
            if(tempDv!=null){
                if(tempDv.v!=tempDv.vn) {
                    if(tempDv.getDV(res,tempDv.vn)!=null) {
                        k++;
                        res.add(k,tempDv);
                    }
                }
            }
        }
        System.out.println(res);
    }
}

class DualValues{
    int v,vn;
    DualValues(){

    }
    DualValues(int v,int vn){
        this.v=v;
        this.vn = vn;
    }

    public DualValues getDV(List<DualValues> dv,int fval){
       Optional<DualValues>  d = dv.stream()
                .filter(dvt-> dvt.v ==fval)
                .findFirst();
       if(d.isPresent())
            return d.get();
       else
           return new DualValues();
    }
}
class TreeNode{
    int val;
    TreeNode nextVal;
    TreeNode(){

    }
    TreeNode(int val){
        this.val = val;
        this.nextVal = null;
    }

    TreeNode(int val, TreeNode nextVal){
        this.val = val;
        this.nextVal = nextVal;
    }

    public boolean findTreeNodeVal(TreeNode treeNode,int val){
        boolean isFound = false;
        if(treeNode!=null){
            while(treeNode!=null){
                if(treeNode.val==val){
                    isFound = true;
                    break;
                } else {
                    treeNode = treeNode.nextVal;
                }
            }
        }

        return isFound;
    }
}
