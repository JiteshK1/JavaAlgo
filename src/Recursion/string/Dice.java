package Recursion.string;

import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
        dic("",4);
        ArrayList<String> list=dicList("",5);
        System.out.println(list);
    }

    static void  dic(String p, int target){
        if (target==0){
            System.out.println(p);
            return;
        }

        for (int i = 1; i <=6 &&i<=target; i++) {
            dic(p+i,target-i);
        }
    }

    static ArrayList<String> dicList(String p , int target){
        if (target==0){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
        return list;
        }
        ArrayList<String> list=new ArrayList<>();
        for (int i = 1; i <=6&& i<=target ; i++) {
            list.addAll(dicList(p+i,target-i));
        }
        return list;
    }

}
