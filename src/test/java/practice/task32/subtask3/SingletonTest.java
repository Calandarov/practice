package practice.task32.subtask3;

import org.junit.Test;

public class SingletonTest {
    @Test
    public void getInstance() {
        System.out.println(Singleton.getInstance());
        System.out.println(Singleton.getInstance());
    }
}
