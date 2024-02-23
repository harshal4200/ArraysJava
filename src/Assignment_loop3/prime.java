package Assignment_loop3;

import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no: ");
        int n=sc.nextInt();
        int count=0;
        int i=1;
        while ( i<=n){
            if (n%i==0) {
                count++;
            }
            i++;
        }
        if (count==2){
            System.out.println("Prime no");
        }else {
            System.out.println("Not a prime no.");
        }
    }

}
