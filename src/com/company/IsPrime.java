package com.company;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class IsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int n = sc.nextInt();
        for (int j=0;j<n;j++) {
            int t= sc.nextInt();
            int count=0;
            for (int i = 2; i  <=sqrt(t) ; i++) {
                if (t % i == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0){
                System.out.println("Prime");}
            else{
                System.out.println("Non Prime");}
        }
    }
}


