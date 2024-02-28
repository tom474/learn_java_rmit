package w8_inheritance.recipe_display;

import w8_inheritance.recipe_component.RecipeComponent;
import w8_inheritance.separator.Separator;

import java.util.ArrayList;

public class RecipeDisplay {
    ArrayList<RecipeComponent> components;
    Separator sep;

    public void setSep(Separator sep) {
        this.sep = sep;
    }

    public void displaySeparator() {
        System.out.println(sep.getSeparator());
    }

    public RecipeDisplay() {
        components = new ArrayList<RecipeComponent>();
    }

    public void addComponent(RecipeComponent rc) {
        components.add(rc);
    }

    public void display() {
        System.out.println("I don't know how to display");
    }
}
