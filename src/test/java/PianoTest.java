import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    InstrumentType instrumentType;

    @Before
    public void before() {
        piano = new Piano("CFX", 8000, 10000, instrumentType.KEYBOARDS, "Yamaha");
    }

    @Test
    public void pianoHasAName() {
        assertEquals("CFX", piano.getName());
    }

    @Test
    public void pianoHasPurchasePrice() {
        assertEquals(8000, piano.getPurchasePrice(), 0.0);
    }

    @Test
    public void pianoHasPriceSold() {
        assertEquals(10000, piano.getSoldPrice(), 0.0 );
    }

    @Test
    public void pianoHasInstrumentType() {
        assertEquals(InstrumentType.KEYBOARDS, piano.getInstrumentType());
    }

    @Test
    public void pianoHasManufacturer() {
        assertEquals("Yamaha", piano.getManufacturer());
    }

}
