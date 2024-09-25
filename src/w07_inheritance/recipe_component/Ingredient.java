package w07_inheritance.recipe_component;

public class Ingredient {
    String name;
    String measurement;

    public Ingredient(String n, String m) {
        name = n;
        measurement = m;
    }

    public String toString() {
        return String.format("%s %s", name, measurement);
    }
}
