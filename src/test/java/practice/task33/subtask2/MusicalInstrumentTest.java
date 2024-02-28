package practice.task33.subtask2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class MusicalInstrumentTest {
    @Test
    public void createObject() {
        MusicalInstrument instrument1 = new MusicalInstrument("Instrument1", 1, 2, 3, 4, 5, 2024);

        System.out.println(instrument1.getDimensions());
        System.out.println(MusicalInstrument.Stat.amountInstrument);
    }
}
