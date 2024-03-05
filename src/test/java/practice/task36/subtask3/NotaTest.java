package practice.task36.subtask3;

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

        System.out.println(re.getId());
        System.out.println(mi.getTitle());
        System.out.println(fa.getDuration());
        System.out.println(sol.isHaveSharp());
        System.out.println(la.isHaveFlat());
        System.out.println(si.getId());
        System.out.println(notaDo.getDuration());
    }
}
