package w8_inheritance.recipe_component;

import java.util.Comparator;

public class RecipeComponentByDigits implements Comparator<RecipeComponent> {
    @Override
    public int compare(RecipeComponent o1, RecipeComponent o2) {
        int length = Double.toString(o1.amount).length() < Double.toString(o2.amount).length() ? Integer.toString((int) o1.amount).length() : Integer.toString((int) o2.amount).length();
        for (int i = 1; i <= length; i++) {
            int r1a = Integer.parseInt(Integer.toString((int) o1.amount).substring(0,i));
            int r2a = Integer.parseInt(Integer.toString((int) o2.amount).substring(0,i));

            if (r1a > r2a) {
                return 1;
            } else if (r1a < r2a) {
                return -1;
            }
        }
        return 0;
    }
}
