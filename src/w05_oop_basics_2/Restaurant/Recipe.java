package w05_oop_basics_2.Restaurant;

import java.util.HashSet;

public class Recipe {
    private String name;
    private HashSet<RecipeComponent> components;
    private int number;
    private static int totalRecipe = 0; // Exercise4

    public Recipe (String name, int number) {
        this.name = name;
        this.number = number;
        this.components = new HashSet<RecipeComponent>();
        totalRecipe++;
    }

    public void addComponent(int idx) {
        System.out.println("Adding new component....");
        components.add(RecipeComponent.createRecipeComponent());
    }

    public void displayRecipe() {
        System.out.println(name + " (Recipe)");
        for(RecipeComponent rp: components){
            rp.displayRecipeComponent();
            System.out.println("------------");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public static int getTotalRecipe() {
        return totalRecipe;
    }
}
