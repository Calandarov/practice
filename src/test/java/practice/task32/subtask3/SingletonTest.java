package practice.task32.subtask3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class SingletonTest {
    @Test
    public void getInstance() {
        System.out.println(Singleton.getInstance());
        System.out.println(Singleton.getInstance());
    }
}
