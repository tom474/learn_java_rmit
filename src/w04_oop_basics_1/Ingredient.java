package w04_oop_basics_1;

public class Ingredient {
    private String name;
    private String measurementUnit;

    public Ingredient() {
        this.name = "Default";
        this.measurementUnit = "Default";
    }

    public Ingredient(String name, String measurementUnit) {
        this.name = name;
        this.measurementUnit = measurementUnit;
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

    public boolean setMeasurementUnit(String measurementUnit) {
        String[] availableUnits = {"g", "mg", "ml", "l", "teaspoon", "spoon"};
        boolean matched = false;
        for (String unit: availableUnits){
            if (measurementUnit.equals(unit)){
                matched = true;
            }
        }

        if (matched){
            this.measurementUnit = measurementUnit;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "name='" + name + '\'' +
                ", measurementUnit='" + measurementUnit + '\'' +
                '}';
    }
}
