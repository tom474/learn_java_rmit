package w4_oop_basics_1;

import java.util.ArrayList;
import java.util.Scanner;

public class RestaurantSystem {
    public static void main(String[] args){
        // Exercise1 && Exercise2
        Scanner scanner = new Scanner(System.in);
        ArrayList<Ingredient> ingredientsList = new ArrayList<>();

        int exit = 0;
        while (exit != 1) {
            System.out.println("Enter the ingredient name: ");
            String name = scanner.next();
            System.out.println("Enter the ingredient measurement unit: ");
            String unit = scanner.next();
            Ingredient ingredient = new Ingredient(name, unit);
            ingredientsList.add(ingredient);

            System.out.println("If you finish, please press 1, if not 0");
            exit = scanner.nextInt();
        }
        displayIngredient(ingredientsList);

        // Exercise3
        Ingredient ingredient = new Ingredient();
        System.out.println(ingredient);
        if (ingredient.setMeasurementUnit("Invalid")){
            System.out.println("Successful");
        } else {
            System.out.println("Unsuccessful");
        }
        System.out.println(ingredient);
        if (ingredient.setMeasurementUnit("ml")){
            System.out.println("Successful");
        } else {
            System.out.println("Unsuccessful");
        }
        System.out.println(ingredient);

        // Exercise4
        Recipe r1 = new Recipe("first", 3);
        for (int i = 0; i < 3; i++){
            r1.addComponent(i);
        }
        r1.display();
    }

    public static void displayIngredient(ArrayList<Ingredient> list){
        for (Ingredient ingredient: list){
            System.out.println(ingredient);
        }
    }
}
