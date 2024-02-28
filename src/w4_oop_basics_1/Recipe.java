package w4_oop_basics_1;

import java.util.Arrays;
import java.util.Scanner;

public class Recipe {
    private String name;
    private RecipeComponent[] listComponent;
    private int number;

    public Recipe() {
        this.name = "Default";
        this.number = 0;
        this.listComponent = null;
    }

    public Recipe(String name, int number) {
        this.name = name;
        this.number = number;
        listComponent = new RecipeComponent[number];
    }

    public String getName() {
        return name;
    }

    public void addComponent(int index){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adding a new component....");
        System.out.println("Enter the ingredient name: ");
        String name = scanner.next();
        System.out.println("Enter the ingredient measurement unit: ");
        String unit = scanner.next();
        System.out.println("Enter the amount: ");
        float amount = scanner.nextFloat();
        Ingredient ingredient = new Ingredient(name, unit);
        listComponent[index] = new RecipeComponent(amount, ingredient);
    }

    public void display(){
        System.out.println(name + " (Recipe)");
        for (RecipeComponent rc: listComponent){
            System.out.println(rc);
            System.out.println("-------------");
        }
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

    @Override
    public String toString() {
        return "Recipe{" +
                "name='" + name + '\'' +
                ", listComponent=" + Arrays.toString(listComponent) +
                ", number=" + number +
                '}';
    }
}
