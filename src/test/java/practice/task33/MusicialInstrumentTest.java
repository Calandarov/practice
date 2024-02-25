package practice.task33;

import org.junit.Test;

public class MusicialInstrumentTest {
    @Test
    public void createObject() {
        MusicalInstrument instrument1 = new MusicalInstrument("Instrument1", 1, 2, 3, 4, 5, 2024);

        System.out.println(instrument1.getDimensions());
        System.out.println(MusicalInstrument.Stat.amountInstrument);
    }
}
