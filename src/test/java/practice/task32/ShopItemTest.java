package practice.task32;

import org.junit.Test;

public class ShopItemTest {
    @Test
    public void createObject() {
        ShopItem shopItem1 = new ShopItem("ShopItem1", 1, 2, 3, 4, 5);
        ShopItem shopItem2 = new ShopItem("ShopItem2", 6, 7, 8, 9, 10);

        System.out.println(ShopItem.getAmountShopItem());
    }
}
