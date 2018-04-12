package rpi;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.apache.log4j.Logger;
import org.junit.Test;


public class GoogleTest {
    private final static Logger logger = Logger.getLogger(GoogleTest.class);
    
    @Test
    public void testTrue() {
        assertThat("Should be true", true, is(true));
    }
    
    @Test
    public void testFalse() {
        assertThat("Should be false", false, is(false));
    }
 
}
