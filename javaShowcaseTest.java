import static org.junit.Assert.*;

import java.beans.Transient;

import org.junit.*;

public class javaShowcaseTest {
    @Test
    public void doubleNum(){
        assertEquals(2, javaShowcase.multiplyByTwo(2)); 
        //should fail because expected is 4
    }
}
