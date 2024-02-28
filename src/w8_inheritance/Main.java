package w8_inheritance;

import w8_inheritance.recipe_component.Ingredient;
import w8_inheritance.recipe_component.RecipeComponent;
import w8_inheritance.recipe_display.RecipeCasualDisplay;
import w8_inheritance.recipe_display.RecipeDisplay;
import w8_inheritance.recipe_display.RecipeHackerDisplay;
import w8_inheritance.recipe_display.RecipeSeriousDisplay;
import w8_inheritance.separator.BinarySeparator;
import w8_inheritance.separator.DashSeparator;
import w8_inheritance.separator.SpaceSeparator;

public class Main {
    public static void main(String[] args) {
        Ingredient i1 = new Ingredient("Water", "ml");
        Ingredient i2 = new Ingredient("Salt", "mg");
        Ingredient i3 = new Ingredient("Sugar", "kg");
        Ingredient i4 = new Ingredient("Chicken", "g");

        RecipeComponent rc1 = new RecipeComponent(i1, 11.2);
        RecipeComponent rc2 = new RecipeComponent(i2, 23.2);
        RecipeComponent rc3 = new RecipeComponent(i3, 5.2);
        RecipeComponent rc4 = new RecipeComponent(i4, 2.3);

        RecipeDisplay recipeDisplay = new RecipeCasualDisplay();
        recipeDisplay.addComponent(rc1);
        recipeDisplay.addComponent(rc2);
        recipeDisplay.addComponent(rc3);
        recipeDisplay.addComponent(rc4);

        recipeDisplay.setSep(new DashSeparator());
        recipeDisplay.display();
        System.out.println();

        RecipeDisplay recipeDisplay1 = new RecipeSeriousDisplay();
        recipeDisplay1.addComponent(rc1);
        recipeDisplay1.addComponent(rc2);
        recipeDisplay1.addComponent(rc3);
        recipeDisplay1.addComponent(rc4);

        recipeDisplay1.setSep(new SpaceSeparator());
        recipeDisplay1.display();

        System.out.println();
        RecipeDisplay recipeDisplay2 = new RecipeHackerDisplay();
        recipeDisplay2.addComponent(rc1);
        recipeDisplay2.addComponent(rc2);
        recipeDisplay2.addComponent(rc3);
        recipeDisplay2.addComponent(rc4);

        recipeDisplay2.setSep(new BinarySeparator());
        recipeDisplay2.display();
    }
}
