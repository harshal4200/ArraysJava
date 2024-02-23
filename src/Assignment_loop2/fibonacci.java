package Assignment_loop2;

public class fibonacci {
    public static void main(String[] args) {
        int a=0,b=1;
        int n=10;

        for (int i=1;i<=n;++i){

            int fabo=a+b;
            a=b;
            b=fabo;
            System.out.println(a);
        }
    }
}
