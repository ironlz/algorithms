package uint2_3;

import org.junit.Assert;
import org.junit.Test;

public class BinarySearchTest {
    @Test
    public void binarySearchTest(){
        int[] test = {1,2,3,4,5,6,7,8};
        int index = BinarySearch.binarySearch(test,7);
        Assert.assertEquals(6, index);
    }
}
