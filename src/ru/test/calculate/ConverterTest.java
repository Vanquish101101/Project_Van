package calculate;

//import org.hamcrest.Matcher;
//
//import static org.junit.Assert.*;
//import static org.hamcrest.core.Is.is;
//import org.junit.Test;
//
//public class ConverterTest {
//
//    @Test
//    public void rubleToDollar() {
//        assertThat(Converter.rubleToDollar(120), is(2));
//    }
//
//    @Test
//    public void rubleToEuro() {
//        assertThat(Converter.rubleToDollar(140), is(2));
//    }
//}

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert180RblThen3Dlr() {
        int in = 180;
        int expected = 3;
        int out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out);
    }
}