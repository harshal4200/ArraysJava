package Array;

public class MinimumElement {
    public static void main(String[] args) {
        int array[] = {2,4,1,7,5};
        int min = array[0];
        for (int i=1; i<array.length; i++){
            if (array[i]<min){
                min=array[i];
            }
        }
        System.out.println("The minimum Element is: "+min);
    }
}
