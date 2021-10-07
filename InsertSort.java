import java.util.*;
import java.lang.*;

public class InsertSort {

    void Sort (double[] arr){
        for (int i =1; i < arr.length;i++){
            double temp = arr[i];
            int j =i -1 ;
            //shift everything to the right
            while (j>=0 && arr[j]>temp){
                arr[j+1] = arr[j];
                j--;
            }
            // insert temp
            arr[j+1] = temp;
        }
    }
    private void swap(int[] arr, int i, int j){
        int d = arr[j];
        arr[j] = arr[i];
        arr[i] = d;
    }
    public static void main(String[] args) {
        InsertSort is = new InsertSort();
        double[] arr1 = {9,7,15,1,12,34,9,98};

        System.out.println("Original: " + Arrays.toString(arr1));
        is.Sort(arr1);
        System.out.println("Sorted: " +Arrays.toString(arr1));
    }
}
