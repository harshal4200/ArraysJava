package Array;

public class MaximumElement {
    public static void main(String[] args) {
        int[] array = {1,4,2,6,7};
        int max=array[0];
        for (int i = 1; i < array.length; i++){
            if(array[i] > max) {
                max=array[i];
            }
        }
        System.out.println("Maximum element is: "+max);
    }
}
