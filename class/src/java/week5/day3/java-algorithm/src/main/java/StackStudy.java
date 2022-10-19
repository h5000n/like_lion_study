import java.util.ArrayList;
import java.util.List;

public class StackStudy {
    private int[] arr = new int[1000];
    private List<Integer> arl = new ArrayList<>();
    private int pointer = 0;
/*
자료가 많아지면 리스트로 구현시 매우 느려진다.
 */


    public StackStudy() {
    }

    public StackStudy(int size){
        this.arr = new int[size];
    }
    public void push(int value){
        this.arr[this.pointer] = value ;
        this.pointer++;
    }
    public int pop(){
        int value = this.arr[this.pointer-1];
        this.pointer--;
        return value;
    }
    public int[] getArr(){
        return arr;
    }

}
