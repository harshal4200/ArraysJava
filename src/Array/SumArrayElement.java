package Array;

public class SumArrayElement {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
         //variable to store the sum
        int sum=0;
        //Iterate through each element in the array and add it to sum
        for (int i=0; i < array.length; i++){
            sum += array[i];
        }
        //Print the sum
        System.out.println("Sum of array elements: "+sum);
    }
}
