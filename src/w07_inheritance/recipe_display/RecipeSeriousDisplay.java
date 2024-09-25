package w07_inheritance.recipe_display;

import w07_inheritance.recipe_component.RecipeComponent;
import w07_inheritance.recipe_component.RecipeComponentByAmount;

public class RecipeSeriousDisplay extends RecipeDisplay {
    @Override
    public void display() {
        components.sort(new RecipeComponentByAmount());
        for (RecipeComponent rc: components) {
            System.out.println(rc);
            super.displaySeparator();
        }
    }
}
