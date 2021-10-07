import java.util.*;
import java.lang.*;

public class QuickSort {
    // making sure that we have the same function as other sort
    void Sort(double[]arr){
        QuickSort(arr, 0, arr.length-1);
    }
    void QuickSort(double[] arr, int left, int right){
        if ( left < right){
            int p = partition(arr,left,right);
            QuickSort(arr,left,p-1);
            QuickSort(arr,p+1,right);
        }
    }
    int partition(double[] arr, int left, int right){
        // set pivot at right first
        int pivot = right;
        if(left < right){
            int i = left;
            int j = right -1;
            while(i <= j){
                // find the bigger one from left
                while (i < right && arr[i]<arr [pivot]){
                    i ++;
                }
                // find the smaller one from right
                while (j >= i && arr[j] >= arr[pivot]){
                    j--;
                }
                //swap arr[i] and arr[j]
                if (i < j){
                    swap(arr,i,j);
                }else{
                    // when i and j meet swap with pivot
                    swap(arr,i,pivot);
                    pivot = i;
                }
            }
        }
        return pivot;
    }
    private void swap(double[] arr, int i, int j){
        double d = arr[j];
        arr[j] = arr[i];
        arr[i] = d;
    }

    public static void main(String[] args) {
        QuickSort qs = new QuickSort();
        double[] arr1 = {9,7,15,1,12,34,9,98};
        System.out.println("Original: " + Arrays.toString(arr1));
        qs.Sort(arr1);
        System.out.println("Sorted: " +Arrays.toString(arr1));
    }
}
