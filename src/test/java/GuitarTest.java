import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    InstrumentType instrumentType;

    @Before
    public void before(){
        guitar = new Guitar("Mustang", 150, 365.0, instrumentType.STRINGS,"Fender");
    }

    @Test
    public void guitarHasName() {
        assertEquals("Mustang", guitar.getName());
    }

    @Test
    public void guitarHasPurchasePrice(){
        assertEquals(150, guitar.getPurchasePrice(), 0.0);
    }

    @Test
    public void guitarHasPriceSold(){
        assertEquals(365.0, guitar.getSoldPrice(), 0.0);
    }

    @Test
    public void guitarHasAnInstrumentType(){
        assertEquals(instrumentType.STRINGS, guitar.getInstrumentType());
    }

    @Test
    public void guitarHasManufacturer(){
        assertEquals("Fender", guitar.getManufacturer());
    }
}
