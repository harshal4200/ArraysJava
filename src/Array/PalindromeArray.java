package Array;

public class PalindromeArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,2,1};
        boolean isPalindrome = checkPalindrome(array);
        if (isPalindrome){
            System.out.println("The array is palindrome.");
        }else {
            System.out.println("The array is not a palindrome.");
        }
    }
    public static boolean checkPalindrome(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start < end){
            if (arr[start] != arr[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
