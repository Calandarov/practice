package practice.task32.subtask1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class ShopItemTest {
    @Test
    public void checkIsUniqueId() {
        ShopItem shopItem1 = new ShopItem("ShopItem1", 1, 2, 3, 4, 5);
        ShopItem shopItem2 = new ShopItem("ShopItem2", 6, 7, 8, 9, 10);

        Assertions.assertNotEquals(shopItem1.getId(), shopItem2.getId());
    }
}
