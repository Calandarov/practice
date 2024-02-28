package practice.task3;

import org.junit.Assert;
import org.junit.Test;

public class BracketUtilTest {
    @Test
    public void checkEqualNumberOfBrackets() {
        Assert.assertTrue(BracketUtil.checkNumberOfBrackets("[]", '[', ']'));
        Assert.assertTrue(BracketUtil.checkNumberOfBrackets("(())", '(', ')'));
        Assert.assertTrue(BracketUtil.checkNumberOfBrackets("{{{}}}", '{', '}'));
    }

    @Test
    public void checkNotEqualNumberOfBrackets() {
        Assert.assertFalse(BracketUtil.checkNumberOfBrackets("[]]", '[', ']'));
        Assert.assertFalse(BracketUtil.checkNumberOfBrackets("(", '(', ')'));
        Assert.assertFalse(BracketUtil.checkNumberOfBrackets("}", '{', '}'));
    }
}
