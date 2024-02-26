package practice.task37.subtask2;

import org.junit.Assert;
import org.junit.Test;

public class RecipeTest {
    // TODO: привести в нормальный вид
    @Test
    public void createObjects() {
        Recipes salad = new Salad("Салат", "Обычный", "Это ингредиенты для салата", "Это рецепт салата");
        Recipes pizza = new Pizza("Пицца", "Обычный", "Это ингредиенты для пиццы", "Это рецепт пиццы");
        Recipes porridge = new Porridge("Каша", "Обычный", "Это ингредиенты для каши", "Это рецепт каши");

        Assert.assertEquals("Это ингредиенты для салата", salad.showIngredients());
        Assert.assertEquals("Это рецепт салата", salad.showRecipe());

        Assert.assertEquals("Это ингредиенты для пиццы", pizza.showIngredients());
        Assert.assertEquals("Это рецепт пиццы", pizza.showRecipe());

        Assert.assertEquals("Это ингредиенты для каши", porridge.showIngredients());
        Assert.assertEquals("Это рецепт каши", porridge.showRecipe());
    }
}
