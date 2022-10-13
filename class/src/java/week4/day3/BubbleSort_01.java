package week4.day3;

public class BubbleSort_01 {
    public int[] sort(int[] arr){
        int temp = 0;
        //오룸차순 또는 내림차순으로 정렬하는 알고리즘을 짜보세요.
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;

    }
    public static void main(String[] args) {
        int[] arr = new int[]{7,2,3,9,28,11};
        BubbleSort_01 bubbleSort01 = new BubbleSort_01();
        for(int num : bubbleSort01.sort(arr)){
            System.out.println(num);
        }
    }
}
