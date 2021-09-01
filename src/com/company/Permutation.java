package com.company;

import java.util.Scanner;

public class Permutation {
    public static int fact(int x){
        int rv=1;
        for(int i=1;i<=x;i++){
            rv=rv*i;
        }
        return rv;
    }
    public static void main(String[] Args){
        int n,nfac,r,nminrfac,npr;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        nfac=fact(n);
//        for(int i=1;i<=n;i++){
//            nfac=nfac*i;
//        }
//        //System.out.println(nfac);
        r= sc.nextInt();
        nminrfac=fact(n-r);
//        for(int i=1;i<=n-r;i++){
//            nminrfac*=i;
//        }
       npr=nfac/nminrfac;
        System.out.println(n+" P "+r+" = "+npr);
    }
}
