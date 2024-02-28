package practice.task37.subtask2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class RecipeTest {
    // TODO: привести в нормальный вид
    @Test
    public void createObjects() {
        Recipes salad = new Salad("Салат", "Обычный", "Это ингредиенты для салата", "Это рецепт салата");
        Recipes pizza = new Pizza("Пицца", "Обычный", "Это ингредиенты для пиццы", "Это рецепт пиццы");
        Recipes porridge = new Porridge("Каша", "Обычный", "Это ингредиенты для каши", "Это рецепт каши");

        Assertions.assertEquals("Это ингредиенты для салата", salad.showIngredients());
        Assertions.assertEquals("Это рецепт салата", salad.showRecipe());

        Assertions.assertEquals("Это ингредиенты для пиццы", pizza.showIngredients());
        Assertions.assertEquals("Это рецепт пиццы", pizza.showRecipe());

        Assertions.assertEquals("Это ингредиенты для каши", porridge.showIngredients());
        Assertions.assertEquals("Это рецепт каши", porridge.showRecipe());
    }
}
