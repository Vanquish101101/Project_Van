package calculate;

import org.hamcrest.Matcher;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;
import org.junit.Test;

public class ConverterTestVer2 {

    @Test
    public void rubleToDollar() {
        assertThat(Converter.rubleToDollar(120), is(2));
    }

    @Test
    public void rubleToEuro() {
        assertThat(Converter.rubleToDollar(140), is(2));
    }

}