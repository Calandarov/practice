package practice.task32;

import org.junit.Test;

public class ShopItemTest {
    @Test
    public void createObject() {
        ShopItem shopItem1 = new ShopItem(1, "Test1", 2, 3, 4, 5, 6);
        ShopItem shopItem2 = new ShopItem(3, "Test2", 2, 3, 4, 5, 6);

        System.out.println(ShopItem.getAmountShopItem());
    }
}
