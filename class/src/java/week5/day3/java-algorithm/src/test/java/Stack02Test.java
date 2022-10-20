import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;
import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class Stack02Test {
    @Test
    @DisplayName("push가 잘 되는지")
    void push(){
        Stack02 st = new Stack02();
        st.push(10);
        st.push(20);
        Integer[] arr = st.getArr();
        assertEquals(20,arr[1]);
        assertEquals(10,arr[0]);
    }

    @Test
    void pushAndPop(){
        Stack02 st = new Stack02();
        st.push(10);
        st.push(20);

        assertEquals(20,st.pop());
        assertEquals(10,st.pop());
        //Exception의 검증
        assertThrows(EmptyStackException.class,() -> {
            st.pop();
        });
    }
    @Test
    void isEmpty(){
        Stack02 st = new Stack02();
        assertTrue(st.isEmpty());
        st.push(10);
        assertFalse(st.isEmpty());
        st.pop();
        assertTrue(st.isEmpty());
    }
    @Test
    void peek(){
        Stack02 st = new Stack02();
        assertThrows(EmptyStackException.class,()->{
            st.peek();
        });
        st.push(10);
        int peeked = st.peek();
        assertEquals(10,peeked);
    }

    void realStack(){
        Stack<Integer> st = new Stack();
        assertThrows(EmptyStackException.class,()->{
        });

}

}