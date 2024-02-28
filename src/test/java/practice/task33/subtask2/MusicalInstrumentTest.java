package practice.task33.subtask2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class MusicalInstrumentTest {
    @Test
    public void getDimensions() {
        MusicalInstrument instrument1 = new MusicalInstrument("Instrument1", 1, 2, 3, 4, 5, 2024);
        MusicalInstrument instrument2 = new MusicalInstrument("Instrument2", 2, 3, 4, 5, 6, 2025);

        Assertions.assertEquals("width=2, height=3, depth=4", instrument1.getDimensions().toString());
        Assertions.assertEquals("width=3, height=4, depth=5", instrument2.getDimensions().toString());
    }
}
