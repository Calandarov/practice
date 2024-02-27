package practice.task31.subtask1;

import org.junit.Test;

public class TVTest {
    @Test
    public void createTV() {
        TV samsung = new TV("Samsung", 100, 55, 2023, 5000);

        System.out.println(samsung.getMark());
    }
}
