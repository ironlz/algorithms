package uint2_3;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class MaxSubValueTest {
    @Test
    public void testRight(){
        int[] array = {-2,11,-4,13,-5,-2};
        int n2 = MaxSubValue.getMaxSubValueN2(array);
        int nlogn = MaxSubValue.getMaxSubValueNlogN(array);
        int n = MaxSubValue.getMaxSubValueN(array);
        Assert.assertEquals(n2,nlogn);
        Assert.assertEquals(n2,n);
    }

    @Test
    public void testRandom(){
        int[] length = {100, 1000, 10000, 100000};
        for(int len : length){
            int[] array = new int[len];
            Random random = new Random();
            for(int i = 0; i < len; i++){
                array[i] = random.nextInt(len) - len / 2;
            }
            int n2 = MaxSubValue.getMaxSubValueN2(array);
            int nlogn = MaxSubValue.getMaxSubValueNlogN(array);
            int n = MaxSubValue.getMaxSubValueN(array);
            Assert.assertEquals(n2,nlogn);
            Assert.assertEquals(n2,n);
        }
    }

}
