package w8_inheritance.recipe_display;

import w8_inheritance.recipe_component.RecipeComponent;

public class RecipeCasualDisplay extends RecipeDisplay {
    @Override
    public void display() {
        for (RecipeComponent rc: components) {
            System.out.println(rc);
            super.displaySeparator();
        }
    }
}
