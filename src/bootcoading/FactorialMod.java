package bootcoading;

public class FactorialMod {
    public static int fact(int fact){
        return fact;
    }
    public static void main(String[] args) {
        int factorial=fact(1);
       for (int i=5;i>=1;i--){
           factorial=factorial*i;
           System.out.println(factorial);
       }
    }
}
