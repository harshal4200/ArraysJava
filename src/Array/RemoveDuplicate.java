package Array;
import java.util.Arrays;
public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 4, 5, 6, 6, 7, 8, 8, 9, 9, 10};
        System.out.println("Original array: " + Arrays.toString(array));

        int[] uniqueArray = removeDuplicates(array);
        System.out.println("Array with duplicates removed: " + Arrays.toString(uniqueArray));
    }

    public static int[] removeDuplicates(int[] array) {
        // Sort the array to bring duplicate elements together
        Arrays.sort(array);

        int length = array.length;
        if (length == 0 || length == 1) {
            return array;
        }

        // Initialize variables
        int j = 0;

        // Traverse the sorted array
        for (int i = 0; i < length - 1; i++) {
            // If current element is not equal to next element,
            // move the current element to the next position in the array
            if (array[i] != array[i + 1]) {
                array[j++] = array[i];
            }
        }

        // Assign the last element of the array
        array[j++] = array[length - 1];

        // Create a new array with length equal to j
        int[] uniqueArray = new int[j];

        // Copy elements from original array to new array
        for (int i = 0; i < j; i++) {
            uniqueArray[i] = array[i];
        }

        return uniqueArray;
    }
}
