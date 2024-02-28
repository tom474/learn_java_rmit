package w5_oop_basics_2.Restaurant;

import java.util.Scanner;

public class RecipeComponent {
    private Ingredient ingredient;
    private double amount;

    public RecipeComponent(Ingredient ingredient, double amount) {
        this.ingredient = ingredient;
        this.amount = amount;
    }

    public static RecipeComponent createRecipeComponent() {
        Ingredient ingredient = Ingredient.createIngredient();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the amount: ");
        double amount = scanner.nextDouble();

        return new RecipeComponent(ingredient, amount);
    }

    public void displayRecipeComponent() {
        this.ingredient.displayIngredient();
        System.out.printf("The amount is: %.2f\n", amount);
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
