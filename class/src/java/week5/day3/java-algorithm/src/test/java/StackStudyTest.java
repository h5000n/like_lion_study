import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackStudyTest {
    @Test
    void pushTest(){
        StackStudy stack01 = new StackStudy();
        stack01.push(10);
        stack01.push(20);
        int[] arr= stack01.getArr();
        Assertions.assertEquals(10,arr[0]);
        Assertions.assertEquals(20,arr[1]);

        Assertions.assertEquals(20,stack01.pop());
        Assertions.assertEquals(10,stack01.pop());

        stack01.push(30);
        Assertions.assertEquals(30,stack01.pop());
    }

}