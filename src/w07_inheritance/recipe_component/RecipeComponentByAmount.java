package w07_inheritance.recipe_component;

import java.util.Comparator;

public class RecipeComponentByAmount implements Comparator<RecipeComponent> {
    @Override
    public int compare(RecipeComponent o1, RecipeComponent o2) {
        if (o1.amount > o2.amount) {
            return 1;
        }
        if (o1.amount < o2.amount) {
            return -1;
        }
        return 0;
    }
}
