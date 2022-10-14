package week4.day4;

import java.util.Arrays;

public class InsertionSort {

    public int[] sort(int [] arr){
        int i = 1;
        if(arr[i] < arr[i-1]){
            int temp = arr[i-1];
            arr[i-1] = arr[i];
            arr[i] = temp;
        }

        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {8, 5, 6, 2, 4};

        int i = 1;
        InsertionSort s= new InsertionSort();
        int[] result = s.sort(arr);
        System.out.println(Arrays.toString(result));
    }
}
