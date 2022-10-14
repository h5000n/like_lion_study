package week4.day4;

import java.util.Arrays;

public class InsertionSort02 {

    public int[] sort(int [] arr, int i){
        int j = i;
        if(arr[j] < arr[j-1]){
            int temp = arr[j-1];
            arr[j-1] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {8, 5, 6, 2, 4};

        int i = 1;
        InsertionSort02 s= new InsertionSort02();
        int[] result = s.sort(arr, 1);
        System.out.println(Arrays.toString(result));
    }
}
