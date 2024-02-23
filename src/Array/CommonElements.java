package Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class CommonElements {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8};

        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));

        int[] commonElements = findCommonElements(array1, array2);

        if (commonElements.length > 0) {
            System.out.println("Common elements: " + Arrays.toString(commonElements));
        } else {
            System.out.println("No common elements found.");
        }
    }

    public static int[] findCommonElements(int[] array1, int[] array2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> commonSet = new HashSet<>();

        // Add all elements of array1 to the set
        for (int num : array1) {
            set.add(num);
        }

        // Check if elements of array2 are present in the set
        for (int num : array2) {
            if (set.contains(num)) {
                commonSet.add(num);
            }
        }

        // Convert commonSet to array
        int[] commonElements = new int[commonSet.size()];
        int index = 0;
        for (int num : commonSet) {
            commonElements[index++] = num;
        }

        return commonElements;
    }
}
