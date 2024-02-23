package Array;

import javax.swing.*;

public class EvenNumber {
    public static void main(String[] args) {

        int array[] = {2, 1, 5, 4, 7, 8};
        int even = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i]%2==0){
                even++;
            }
        }
        System.out.println("Even number is: "+even);
    }
}
