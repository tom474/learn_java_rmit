package w8_inheritance.recipe_display;

import w8_inheritance.recipe_component.RecipeComponent;
import w8_inheritance.recipe_component.RecipeComponentByDigits;

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
