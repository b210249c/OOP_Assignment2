public interface Cost {
    double calcIngredientCost(double quantity, double cost_per_unit);
    double calcRecipeTotalCost();
    String displayCost();
}
