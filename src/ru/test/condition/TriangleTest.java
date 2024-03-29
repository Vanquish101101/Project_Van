package condition;

import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {
    @Test
    public void whenTrueExist() {
        double ab = 2.0;
        double ac = 2.0;
        double bc = 2.0;
        boolean result = Triangle.exist(ab, ac, bc);
        Assert.assertTrue(result);
    }

    @Test
    public void whenFalseExist() {
        double ab = 2.0;
        double ac = 2.0;
        double bc = 5.0;
        boolean result = Triangle.exist(ab, ac, bc);
        Assert.assertFalse(result);
    }
}