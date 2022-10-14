package week4.day4;

import java.util.Arrays;

public class InsertionSort03 {

    public int[] sort(int [] arr){
        for (int i = 1; i < arr.length; i++){
            for (int j = i; j > 0; j--){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {8, 5, 6, 2, 4};

        int i = 1;
        InsertionSort03 s= new InsertionSort03();
        int[] result = s.sort(arr);
        System.out.println(Arrays.toString(result));
    }
}
