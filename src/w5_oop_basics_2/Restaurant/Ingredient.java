package w5_oop_basics_2.Restaurant;

import java.util.Scanner;

public class Ingredient {
    private String name;
    private String measurementUnit;

    // Exercise3
    private String comment;
    public Ingredient(String name, String measurementUnit, String comment) {
        this.name = name;
        this.measurementUnit = measurementUnit;
        this.comment = comment;
    }

    // Exercise1
    public static Ingredient createIngredient() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the name of the ingredient: ");
        String name = scanner.nextLine();
        System.out.println("Please input the measurement of the ingredient: ");
        String measurementUnit = scanner.nextLine();

        // Exercise3
        System.out.println("Please input the comment of the ingredient: ");
        String comment = scanner.nextLine();
        if (comment.equals("")) {
            comment = "No comment";
        }
        return new Ingredient(name, measurementUnit, comment);
    }

    // Exercise1
    public void displayIngredient(){
        System.out.printf("The ingredient is: %s and the measurement unit is: %s and the comment is: %s\n", name, measurementUnit, comment);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMeasurementUnit() {
        return measurementUnit;
    }

    public void setMeasurementUnit(String measurementUnit) {
        String[] availableUnits = {"teaspoon", "spoon", "mg"};
        boolean matched = false;
        for (String unit: availableUnits) {
            if (measurementUnit.equals(unit)) {
                matched = true;
            }
        }
        if (matched) {
            this.measurementUnit = measurementUnit;
        } else {
            System.out.println("Error unit");
        }
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
