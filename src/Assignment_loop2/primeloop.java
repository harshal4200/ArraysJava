package Assignment_loop2;

public class primeloop {
    public static void main(String[] args) {
        int num=5;
        int cout=0;
        for (int i=1;i<=num;i++){
            if (num%i==0){
                cout++;
            }
        }

        if(cout==2) {
            System.out.println("Prime no");
        }else {
            System.out.println("Not Prime no");
        }
    }
}
