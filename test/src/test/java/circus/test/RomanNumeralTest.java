package circus.test;

import org.junit.Assert;
import org.junit.Test;
import circus.RomanNumeral;

public class RomanNumeralTest {

    @Test
    public void testIntToRoman() {
        RomanNumeral roman = new RomanNumeral(42);

        Assert.assertEquals("XLII", roman.toString());
    }

    @Test
    public void testRomanToInt() {
        RomanNumeral roman = new RomanNumeral("MMXV");

        Assert.assertEquals(2015, roman.toInt());
    }
}
