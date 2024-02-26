package practice.task37.subtask2;

public class Pizza extends Recipes {
    private String ingredients;
    private String recipe;

    public Pizza(String title, String type, String ingredients, String recipe) {
        super(title, type);
        this.ingredients = ingredients;
        this.recipe = recipe;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }

    @Override
    public String showIngredients() {
        return ingredients;
    }

    @Override
    public String showRecipe() {
        return recipe;
    }
}
