package Assignment_loop3;

import java.util.*;
public class while_factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int i=sc.nextInt();
        int factorial=1;
        while (i>1){
            factorial =i*factorial;
            i--;
            System.out.println(factorial);
        }
    }
}
