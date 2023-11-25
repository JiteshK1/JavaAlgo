package Recursion.string;

import java.util.ArrayList;

public class SubSeq {
    public static void main(String[] args) {

        System.out.println(
                subseqArray("","abc")

        );

        subseqASCII("","ab");
    }

    static void subseq(String p,String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        subseq(p+up.charAt(0),up.substring(1));
        subseq(p,up.substring(1));

    }
    static ArrayList<String> subseqArray(String p,String up){
        if (up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> left=subseqArray(p+up.charAt(0),up.substring(1));
        ArrayList<String> right=subseqArray(p,up.substring(1));

        left.addAll(right);
        return left;
    }
static void  subseqASCII(String p,String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

        subseqASCII(p+up.charAt(0),up.substring(1));
    subseqASCII(p,up.substring(1));
    subseqASCII(p+ (up.charAt(0)+1),up.substring(1));

    }

}
