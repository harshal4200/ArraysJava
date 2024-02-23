package bootcoading;

public class Method {
    public static int add(int a,int b){
        return a+b;
    }
    public static int sub(int a,int b){

        return a-b;
    }
    public static int mul(int a,int b){

        return a*b;
    }
    public static int div(int a,int b){
        return a/b;
    }
    public static int mod(int a,int b){

        return a%b;
    }
    public static void main(String[] args) {
        int sum=add(3,5);
        int sub=sub(5,3);
        int mul=mul(5,2);
        int div=div(5,3);
        int mod=mod(5,8);
        System.out.println("Addition : "+sum);
        System.out.println("Subtraction: "+sub);
        System.out.println("Multiplication: "+mul);
        System.out.println("Division: "+div);
        System.out.println("Modulus: "+mod);
    }
}


