package w07_inheritance.recipe_component;

public class RecipeComponent {
    Ingredient ing;
    double amount;

    public RecipeComponent(Ingredient ing, double amount) {
        this.ing = ing;
        this.amount = amount;
    }

    public String toString() {
        return (ing.toString() + " - " + amount);
    }
}
