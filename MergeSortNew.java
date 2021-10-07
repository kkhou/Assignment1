import java.util.*;
import java.util.ArrayList;
import java.lang.*;

public class MergeSortNew {

    void Sort(double[] arr) {
        //use arraylist to keep track of region because the size isn't fixed
        ArrayList<Integer> region = new ArrayList<Integer>();
        region.add(0);
        for ( int i =1; i < arr.length; i++){
            if (arr[i-1] > arr[i]) {
                region.add(i);
            }
        }
        region.add(arr.length);
        // if region equals 2, then it is already sorted.
        while (region.size() >2) {
            //merge two regions at a time
            for (int i = 0; i < region.size() - 2; i += 2) {
                MergeRegion(arr, region.get(i), region.get(i + 1), region.get(i + 2) - 1);
                region.set(i + 1, -1);
            }
            // removed the index of merged region
            for (int j = region.size() - 1; j > 0; j--) {
                if (region.get(j) == -1) {
                    region.remove(j);
                }
            }
        }
    }
    // use left, right, end to indicate the range of two region.
    void MergeRegion(double[] arr, int left, int right, int end){
        double[] arrLeft = new double[right - left];
        double[] arrRight = new double[end - right +1];
        double[] temp = new double[arrLeft.length + arrRight.length];
        // copy arr into arrLeft
        for (int j =0 ;j< arrLeft.length;j++){
            arrLeft[j] = arr[left+j];
        }
        // copy arr into arrRight
        for (int k = 0 ; k < arrRight.length;k++){
            arrRight[k] = arr[right+k];
        }
        //merge arrLeft and arrRight into temp
        merge(temp, arrLeft, arrRight );
        //put temp back into arr
        for (int l =0; l< temp.length; l++){
            arr[left+l] = temp[l];
        }
    }

    void merge(double[] arr, double[] left, double[] right){
        int i=0,j=0,k=0;
        while ( i < left.length && j < right.length){
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
        while (i < left.length){
            arr[k] = left[i];
            i++;
            k++;
        }
        while (j< right.length){
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        MergeSortNew msn = new MergeSortNew();
        double[] arr1 = {54,38,59,12,65,84,39,27};

        System.out.println("Original: " + Arrays.toString(arr1));
        msn.Sort(arr1);
        System.out.println("Sorted: " +Arrays.toString(arr1));
    }
}

