package bitwise;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {

        for (int i = 0; i < 15; i++) {
            System.out.println(i+" "+isPrime(i) );
        }
//    isPrimeAd(36);
    int n=40;
    boolean[] primes= new boolean[n+1];
    seive(n,primes);

    String ch="JAVA";
    }

    static boolean isEven(int num){
           return (num & 1)==0;
    }

    static boolean isPrime(int n){

        if (n<=1)return false;

        int c=2;
        while (c*c<=n){

             if (n%c==0){
                 return false;
             }
             c++;
       }
        return true;

    }
static void  isPrimeAd(int n){
    for (int i = 1; i < n; i++) {
        System.out.println(i+ " is prime: "+isPrime(i));
    }
}

static void seive(int n,boolean[] primes){
    for (int i = 2; i*i <=n ; i++) {
        if (primes[i]==false){
            for (int j = i*2; j <=n ; j+=i) {
               primes[j]=true;
            }
        }
    }

    for (int i = 2; i <=n ; i++) {
        if (!primes[i]){
            System.out.print(i+" ");
        }
    }
}
}
