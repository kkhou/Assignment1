import java.util.*;
import java.lang.*;

public class SelectionSort {
    void Sort(double[] arr){
        for(int i =0; i< arr.length;i++){
            swap(arr,i, findSmallest(arr,i));
        }
    }
    void swap (double[] arr, int i, int j){
        double temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    int findSmallest(double[] arr, int start){
        //find the smallest in the unsorted portion
        int smallest = start;
        for (int i= start +1; i < arr.length;i++){
            if (arr[i] <arr[smallest]){
                smallest =i;
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        SelectionSort ss = new SelectionSort();
        double[] arr1 = {9,7,15,1,12,34,9,98};

        System.out.println("Original: " + Arrays.toString(arr1));
        ss.Sort(arr1);
        System.out.println("Sorted: " +Arrays.toString(arr1));
    }
}
