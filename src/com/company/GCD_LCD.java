package com.company;

import java.util.Scanner;

public class GCD_LCD {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num1= sc.nextInt();
        int num2= sc.nextInt();
        int n=0;
        int a=0,b=0;
        if(num1>num2)
            n=num1;
        else
            n=num2;
        for (int i=2;i<n;i++){
            if (num1%i==0 && num2%i==0){
                a=i;
                break;
            }}
        for(int i=2;i<num1*num2;i++){
            if(i%num1==0 && i%num2==0){
                b=i;
                break;
            }
        }
    System.out.println(a+"\n"+b);

}}
