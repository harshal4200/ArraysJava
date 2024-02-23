package Array;

public class IndexOfElement {
    public static void main(String[] args) {
        int[] array = {4, 2, 5, 3, 6};
        int target = 4;
        int index = findIndex(array, target);
        if (index != -1) {
            System.out.println("The element " + target + " is: " + index);
        } else {
            System.out.println("The element " + target + " is not found.");
        }
    }

    public static int findIndex(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }

        }
        return -1;
    }
}
