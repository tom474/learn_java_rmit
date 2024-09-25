package w07_inheritance.recipe_display;

import w07_inheritance.recipe_component.RecipeComponent;

public class RecipeCasualDisplay extends RecipeDisplay {
    @Override
    public void display() {
        for (RecipeComponent rc: components) {
            System.out.println(rc);
            super.displaySeparator();
        }
    }
}
