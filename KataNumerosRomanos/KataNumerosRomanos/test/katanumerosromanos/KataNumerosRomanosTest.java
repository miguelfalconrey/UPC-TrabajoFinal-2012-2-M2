
package katanumerosromanos;


import org.junit.Test;
import static org.junit.Assert.*;


public class KataNumerosRomanosTest {
    
  
    
    @Test
    public void DeberiaRetornarElNumeroRomano() {
        NumerosRomanos rn = new NumerosRomanos();
        assertEquals("I", rn.convert(1));
        assertEquals("II", rn.convert(2));
        assertEquals("III", rn.convert(3));
        assertEquals("IV", rn.convert(4));
        assertEquals("V", rn.convert(5));
        assertEquals("VI", rn.convert(6));
        assertEquals("VII", rn.convert(7));
        assertEquals("VIII", rn.convert(8));
        assertEquals("IX", rn.convert(9));
        assertEquals("X", rn.convert(10));
        assertEquals("XIV", rn.convert(14));
        assertEquals("XIX", rn.convert(19));
        assertEquals("XX", rn.convert(20));
        assertEquals("XXXIII", rn.convert(33));
        assertEquals("XXXIV", rn.convert(34));
        assertEquals("XXXIX", rn.convert(39));
        assertEquals("XLIX", rn.convert(49));
        assertEquals("L", rn.convert(50));
        assertEquals("LXXXIX", rn.convert(89));
        assertEquals("XCIX", rn.convert(99));
        assertEquals("CXLIX", rn.convert(149));
        assertEquals("CCCXLIX", rn.convert(349));
        assertEquals("CDLVI", rn.convert(456));
        
        
    }
}
