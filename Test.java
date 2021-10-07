import java.util.Arrays;
import java.util.Random;
import java.lang.*;

public class Test {
    public boolean check(double[] arr){
        for (int i =0 ; i < arr.length-1; i++){
            if (arr[i]> arr[i+1]){
                System.out.println("Isn't Sorted");
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] num ={50000,100000,150000,200000,250000,300000,350000,400000,450000,500000};
        Random rand = new Random();
        Test test = new Test();
        BubbleSort bs = new BubbleSort();
        for ( int n =0; n<num.length;n++) {
            System.out.println("count= " + num[n]);
            double[] arr = new double[num[n]];
            double[] arr1 = new double[num[n]];
            //Bubble Sort
            for (int i = 0; i < num[n]; i++) {
                arr[i] = rand.nextDouble();
            }
            for (int j=0; j<num[n];j++){
                arr1[j] = arr[j];
            }
            //double double_random=rand.nextDouble();
            long a = System.currentTimeMillis();
            //System.out.println("Original: " + Arrays.toString(arr1));
            bs.Sort(arr1);
            //System.out.println("Sorted: " +Arrays.toString(arr1));
            long b = System.currentTimeMillis();
            if (test.check(arr1) == true) {
                System.out.println("Bubble " + (b - a));
            } else {
                System.out.println("Bubble not in order");
            }
            //Insert Sort
            for (int i = 0; i < num[n]; i++) {
                arr1[i] = arr[i];
            }

            InsertSort is = new InsertSort();
            a = System.currentTimeMillis();
            is.Sort(arr1);
            b = System.currentTimeMillis();
            if (test.check(arr1) == true) {
                System.out.println("Insert " + (b - a));
            } else {
                System.out.println("Insert not in order");
            }
            //Merge Sort
            for (int i = 0; i < num[n]; i++) {
                arr1[i] = arr[i];
            }
            MergeSort ms = new MergeSort();
            a = System.currentTimeMillis();
            ms.Sort(arr1);
            b = System.currentTimeMillis();
            if (test.check(arr1) == true) {
                System.out.println("Merge " + (b - a));
            } else {
                System.out.println("Merge not in order");
            }
            //Selection Sort
            for (int i = 0; i < num[n]; i++) {
                arr1[i] = arr[i];
            }
            SelectionSort ss = new SelectionSort();
            a = System.currentTimeMillis();
            ss.Sort(arr1);
            b = System.currentTimeMillis();
            if (test.check(arr1) == true) {
                System.out.println("Selection " + (b - a));
            } else {
                System.out.println("Selction not in order");
            }
            //Quick Sort
            for (int i = 0; i < num[n]; i++) {
                arr1[i] = arr[i];
            }
            QuickSort qs = new QuickSort();
            a = System.currentTimeMillis();
            qs.Sort(arr1);
            b = System.currentTimeMillis();
            if (test.check(arr1) == true) {
                System.out.println("Quick " + (b - a));
            } else {
                System.out.println("Quick not in order");
            }
            //Merge Sort New
            for (int i = 0; i < num[n]; i++) {
                arr1[i] = arr[i];
            }
            MergeSortNew msn = new MergeSortNew();
            a = System.currentTimeMillis();
            msn.Sort(arr1);
            b = System.currentTimeMillis();
            if (test.check(arr1) == true) {
                System.out.println("Merge new " + (b - a));
            } else {
                System.out.println("Merge new not in order");
            }
        }
    }
}
