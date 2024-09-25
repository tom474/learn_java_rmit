package w07_inheritance.recipe_display;

import w07_inheritance.recipe_component.RecipeComponent;
import w07_inheritance.recipe_component.RecipeComponentByDigits;

public class RecipeHackerDisplay extends RecipeDisplay{
    @Override
    public void display() {
        components.sort(new RecipeComponentByDigits());
        for (RecipeComponent rc: components) {
            System.out.println(rc);
            super.displaySeparator();
        }
    }
}
