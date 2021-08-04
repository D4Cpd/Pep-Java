package com.company;
import java.util.Scanner;

public class Project18 {

        public static void main(String[] args) {

            Scanner scn = new Scanner(System.in);

            // write ur code here
            int n=scn.nextInt();
            int sp=0,st=1,st1=0,sp1=0,st2=n-1,sp2=n-4;;
            for(int i=1;i<=n;i++){

                for(int j=1;j<=sp;j++){
                    System.out.print("\t");
                }
                for(int j=1;j<=st;j++){
                    System.out.print("*\t");
                }
                if(i<=n/2)
                    sp++;
                else
                    sp--;
                ///
                for(int j=1;j<=st1;j++){
                    System.out.print("*\t");
                }
                if(i>n/2)
                    st1+=2;
                else
                    st1=0;
                ///
                if(i==1)
                    sp2=0;
                else

                    for(int j=1;j<=sp2;j++){
                        System.out.print("\t");
                    }
                if(i<n/2+1)
                    sp2=sp2-2;
                else
                    sp2=0;
                ///
                if(i!=1)
                    st2=1;
                else
                    st2=n-1;
                if(i>n/2+1)
                    st2=0;
                if(i==n/2+1)
                    st2=0;
                for(int j=1;j<=st2;j++){
                    System.out.print("*\t");
                }
                ///

                System.out.println();
            }
        }
    }

