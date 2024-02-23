package Assignment_loop3;

public class palindrome {
    public static void main(String[] args) {
        int a=123;
        int t=a;
        int rev=0;
        while (t!=0){
            int d=t%10;
            rev=10*rev+d;
            t=t/10;
        }
        if(rev==a){
            System.out.println("palindrome");
        }
        else {
            System.out.println("not palindrome");
        }
    }
}
