package uint2_3;

import org.junit.Assert;
import org.junit.Test;

public class GcdTest {
    @Test
    public void testGcd(){
        int result = Gcd.getGcd(1989, 1590);
        Assert.assertEquals(3, result);
    }
}
