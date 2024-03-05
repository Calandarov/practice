package practice.task36.subtask3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NotaTest {
    @Test
    public void createObjects() {
        Re re = new Re("Re", "Re", 4, true, false);
        Mi mi = new Mi("Mi", "Mi", 5, false, true);
        Fa fa = new Fa("Fa", "Fa", 3, true, true);
        Sol sol = new Sol("Sol", "Sol", 1, true, false);
        La la = new La("La", "La", 2, false, false);
        Si si = new Si("Si", "Si", 6, true, false);
        Do notaDo = new Do("Do", "Do", 2, true, true);

        Assertions.assertEquals("Re", re.getId());
        Assertions.assertEquals("Mi", mi.getTitle());
        Assertions.assertEquals(3, fa.getDuration());
        Assertions.assertTrue(sol.getSharp());
        Assertions.assertFalse(la.getFlat());
        Assertions.assertEquals("Si", si.getId());
        Assertions.assertEquals(2, notaDo.getDuration());
    }
}
