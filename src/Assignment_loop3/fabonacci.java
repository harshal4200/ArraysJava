package Assignment_loop3;

import java.util.Scanner;
public class fabonacci {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int a=0,b=1 ,c;
        System.out.println(a);
        System.out.println(b);
        int i=1;
        while (i<=n){
            c=a+b;
            a=b;
            b=c;
            System.out.println(c);
            i++;
        }
    }
}
