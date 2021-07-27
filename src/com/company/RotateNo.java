package com.company;

import java.util.Scanner;
public class RotateNo {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k= sc.nextInt();
        int rem=0,newnum,rotate,temp=n,count=0;

        while (temp!=0){
            temp=temp/10;
            count++;
        }



        if(k>=0){
            if(k>=count)
                k=k%count;
            int div=(int) Math.pow(10,k);
            System.out.println(count);
            rem=n%div;
            n=n/div;
            int div1=(int) Math.pow(10,count-k);
            newnum=rem*div1+n;}
        else{if((k*-1)>count)
                k=k%count;

            int div=(int) Math.pow(10,count+k);
            System.out.println(count);
            rem=n%div;
            n=n/div;
            int div1=(int) Math.pow(10,-k);
            newnum=rem*div1+n;}

        System.out.println(newnum);


    }
}
