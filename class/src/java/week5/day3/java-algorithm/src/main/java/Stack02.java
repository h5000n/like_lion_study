public class Stack02 {
    private Integer[] arr;
    private int top = 0;
    public Stack02(){
        this.arr = new Integer[10000];
    }
    public Stack02(int size){
        this.arr = new Integer[size];
    }
    public void push(int value){
        this.arr[top] = value;
        this.top++;
    }
    public int pop(){
        int value = this.arr[top-1];
        this.top--;
        return value;
    }

    public Integer[] getArr() {
        return arr;
    }
}
