import java.util.EmptyStackException;

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
        if(this.isEmpty()){
            throw new EmptyStackException();
//            throw new RuntimeException("Stack is empty");
        }
        int value = this.arr[top-1];
        this.top--;
        return value;
    }

    public Integer[] getArr() {
        return arr;
    }

    public boolean isEmpty() {
       boolean isEmpty = this.top == 0;
       return isEmpty;
    }
}
