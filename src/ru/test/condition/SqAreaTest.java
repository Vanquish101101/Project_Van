package condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void WhenP6K2then2 () {
        int expected = 2;
        int p = 6;
        int k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void WhenP8K2then2 () {
        int expected = 2;
        int p = 8;
        int k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void WhenP10K2then2 () {
        int expected = 2;
        int p = 10;
        int k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}

