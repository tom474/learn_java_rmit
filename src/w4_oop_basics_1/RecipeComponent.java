package w4_oop_basics_1;

public class RecipeComponent {
    private float amount;
    private Ingredient ingredient;

    public RecipeComponent() {
        this.amount = 0;
        this.ingredient = null;
    }

    public RecipeComponent(float amount, Ingredient ingredient) {
        this.amount = amount;
        this.ingredient = ingredient;
    }


    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    @Override
    public String toString() {
        return "RecipeComponent{" +
                "amount=" + amount +
                ", ingredient=" + ingredient +
                '}';
    }
}
