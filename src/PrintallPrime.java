import java.util.Scanner;

public class PrintallPrime {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Low Range:");
        int low= sc.nextInt();
        System.out.println("Enter High Range:");
        int high= sc.nextInt();
        for (int i=low;i<=high;i++){
            int count=0;
            for (int j=2;j*j<=i;j++){
                if(i%j==0)
                    count++;
            }
            if (count==0)
                System.out.println(i);
        }
    }
}
