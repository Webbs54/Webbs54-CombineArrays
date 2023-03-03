import java.io.*;
import java.util.ArrayList;
public class CombineArrays {
    /**
     * Combine two arrays into a single array and return it.
     *
     * @param arr1 an array of ints.
     * @param arr2 an array of ints.
     * @return an array containing the contents of arr1 followed by the contents of arr2.
     */
    public int[] combine(int[] arr1, int[] arr2){

        int arr1_Len = arr1.length;
        int arr2_Len = arr2.length;

        int[] arr3 = new int[arr1_Len + arr2_Len];

        int nums = 0;
        for (int i = 0; i < arr1.length; i++) {
            arr3[nums] = arr1[i];
            nums++;
        }

        for (int i : arr2) {
            arr3[nums] = i;
            nums++;
        }

        return arr3;
    }
}
