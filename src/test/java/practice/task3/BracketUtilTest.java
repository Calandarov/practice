package practice.task3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class BracketUtilTest {
    @Test
    public void checkEqualNumberOfBrackets() {
        Assertions.assertTrue(BracketUtil.checkNumberOfBrackets("[]", '[', ']'));
        Assertions.assertTrue(BracketUtil.checkNumberOfBrackets("(())", '(', ')'));
        Assertions.assertTrue(BracketUtil.checkNumberOfBrackets("{{{}}}", '{', '}'));
    }

    @Test
    public void checkNotEqualNumberOfBrackets() {
        Assertions.assertFalse(BracketUtil.checkNumberOfBrackets("[]]", '[', ']'));
        Assertions.assertFalse(BracketUtil.checkNumberOfBrackets("(", '(', ')'));
        Assertions.assertFalse(BracketUtil.checkNumberOfBrackets("}", '{', '}'));
    }
}
