import java.util.*;
import java.lang.*;

public class MergeSort {
    void Sort (double[] arr){
        if (arr.length >1 ){
            double [] left = get_left(arr);
            double [] right = get_right(arr);
            Sort(left);
            Sort(right);
            merge(arr, left, right);
        }
    }
    // get the left array
    double [] get_left( double [] arr){
        int size = arr.length/2;
        double [] left = new double[size];
        for ( int i =0 ; i < size; i++){
            left [i] = arr[i];
        }
        return left;
    }
    // get the right array
    double [] get_right( double [] arr){
        int size = arr.length - arr.length/2;
        double [] right = new double[size];
        for ( int i = 0 ; i < size; i++){
            right [i] = arr[i + arr.length/2];
        }
        return right;
    }
    //
    void merge(double[] arr, double[] left, double[] right){
        int i=0,j=0,k=0;
        while ( i < left.length && j < right.length){
            // compare left[i] and right[j] and copy the smaller one to arr[k].
            // If left[i] = right[j], choose the left one, so it is stable.
            if (left[i] <= right[j]){
                arr [k] = left [i];
                i++;
                k++;
            }else{
                arr[k] = right [j];
                j++;
                k++;
            }
        }
        // if there are more in left[] copy it into arr[k]
        while (i < left.length){
            arr[k] = left[i];
            i++;
            k++;
        }
        // if there are more in right[] copy it into arr[k]
        while (j< right.length){
            arr[k] = right[j];
            j++;
            k++;
        }
    }
    public static void main(String[] args) {
        MergeSort ms = new MergeSort();
        double[] arr1 = {9,7,15,1,12,34,9,98};

        System.out.println("Original: " + Arrays.toString(arr1));
        ms.Sort(arr1);
        System.out.println("Sorted: " +Arrays.toString(arr1));
    }
}
