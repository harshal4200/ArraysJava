package Assignment_loop1;

public class factorial {
    public static void main(String[] args) {


        int factorial = 1;
        for (int i = 5; i >= 1; i--) {
            factorial =factorial*i;
            System.out.println(factorial);
        }
    }
}