import java.util.*;
import java.lang.*;

public class BubbleSort{
    void Sort (double[] arr){
        for (int i=0; i< arr.length; i++){
            boolean swapped = false;
            for (int j=0; j<arr.length-i-1; j++){
                if (arr[j] > arr[j+1]){
                    swap(arr, j, j+1);
                    swapped = true;
                }
            }
            // if not swapped, the array is already sorted
            if (swapped == false)
                break;
        }
    }

    private void swap(double[] arr, int i, int j){
        double d = arr[j];
        arr[j] = arr[i];
        arr[i] = d;
    }

    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        double[] arr1 = {9,7,15,1,12,34,9,98};

        System.out.println("Original: " + Arrays.toString(arr1));
        bs.Sort(arr1);
        System.out.println("Sorted: " +Arrays.toString(arr1));
    }
}

