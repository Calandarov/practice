package practice.task3;

import org.junit.Assert;
import org.junit.Test;

public class BracketUtilTest {
    @Test
    public void isCorrectBrackets() {
        Assert.assertTrue(BracketUtil.isCorrectBrackets("{}", '{', '}'));
        Assert.assertTrue(BracketUtil.isCorrectBrackets("{{{}}}", '{', '}'));

        Assert.assertFalse(BracketUtil.isCorrectBrackets("{{{}}", '{', '}'));
    }
}
