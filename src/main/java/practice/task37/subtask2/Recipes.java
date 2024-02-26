/*
* Объявите абстрактный класс Recipes (рецепты) с полями: название, тип (вегетарианский/обычный).
* И абстрактными методами: showIngredients (показать ингредиенты), showRecipe (показать рецепт).
* Описать несколько дочерних классов: Salad (для салатов), Pizza (для пицц), Porridge (для каш).
* В каждом дочернем классе определить поле для списка ингредиентов (в виде строки) и описания самого рецепта (в виде строки).
* А также реализовать абстрактные методы базового класса Recipes.
* Создать несколько экземпляров дочерних классов и через общий интерфейс (в виде ссылок типа Recipes) вызвать методы showRecipe и showIngredients.
*/
package practice.task37.subtask2;

public abstract class Recipes {
    private String title;
    private String type;

    public Recipes(String title, String type) {
        this.title = title;
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public abstract String showIngredients();

    public abstract String showRecipe();
}
