import java.util.ArrayList;

public class Recipe implements AllergenInformation, CookingTimeEstimation, Comparable{
    private String name;
    private String description;
    ArrayList<Ingredient> ingredients;
    private final String[] allergens_list = {"Crustacean Shellfish", "Egg", "Fish", "Milk", "Peanut", "Soy", "Tree nuts", "Sesame", "Wheat", "Cereals / Gluten", "Sulfites", "Buckwheat", "Celery", "Lupin", "Molluscan Shellfish", "Mustard", "Bee Pollen / Propolis", "Beef", "Chicken", "Latex (Natural Rubber)", "Mango", "Peach", "Pork", "Royal Jelly", "Tomato"};
    private ArrayList<String> found_allergens = new ArrayList<String>();

    protected Recipe(){
        this("Recipe", "This is the description of the recipe.");
    }

    protected Recipe(String name, String description){
        this.name = name;
        this.description = description;
        this.ingredients = new ArrayList<Ingredient>();
    }

    public void addIngredient(Ingredient ingredient){
        ingredients.add(ingredient);
    }

    // Check if the recipe contains allergens
    @Override
    public boolean containsAllergen() {
        for (Ingredient ingredient : ingredients){
            for (String allergen : allergens_list){
                if (ingredient.getName().toLowerCase().contains(allergen.toLowerCase())){
                    found_allergens.add(ingredient.getName());
                }
            }
        }
        return found_allergens.isEmpty();
    }

    @Override
    public ArrayList<String> listAllergens() {
        return this.found_allergens;
    }

    @Override
    public String markAsAllergenFree() {
        if(containsAllergen()){
            return "Allergen Free";
        } else {
            return "Contains Allergen Ingredient(s): " + String.join(", ", listAllergens());
        }
    }

    @Override
    public double calcIngredientCost (double quantity, double cost_per_unit) {
        return quantity * cost_per_unit;
    }

    @Override
    public double calcRecipeTotalCost() {
        double totalCost = 0;
        for (Ingredient ingredient : ingredients){
            totalCost += calcIngredientCost(ingredient.getQuantity(), ingredient.getCost_per_unit());
        }
        return totalCost;
    }

    @Override
    public String displayCost() {
        String costStr = "";
        for (int i = 0; i < ingredients.size(); i++){
            double cost = calcIngredientCost(ingredients.get(i).getQuantity(), ingredients.get(i).getCost_per_unit());

            costStr += (i + 1) + ". " + ingredients.get(i).getName() + " : RM " + String.format("%.2f", cost) + "\n";
        }

        return costStr;
    }

    @Override
    public int compareTo(Object o) {
        Recipe otherRecipe = (Recipe) o;
        return Double.compare(this.calcRecipeTotalCost(), otherRecipe.calcRecipeTotalCost());
    }

    public String displayIngredients(){
        String ingredientsStr = "";
        for (int i = 0; i < ingredients.size(); i++){
            ingredientsStr += (i+1) + ". " + ingredients.get(i).getName() + " " + String.format("%.2f", ingredients.get(i).getQuantity()) + " " + ingredients.get(i).getUnit() + "\n";
        }

        return ingredientsStr;
    }

    @Override
    public String toString() {
        return "--------------------------------------------------------------------------" +
                "\nRecipe:" +
                "Name : " + name + "\n\n" +
                "Description : " + "\n" + description + "\n\n" +
                "Ingredients : " + "\n" + displayIngredients() + "\n" +
                markAsAllergenFree() + "\n\n" +
                "Cost of Ingredients : " + "\n" + displayCost() + "\n" +
                "Total Cost : RM " + String.format("%.2f", calcRecipeTotalCost()) + "\n"
                ;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }

    public ArrayList<String> getFound_allergens() {
        return found_allergens;
    }

    public String[] getAllergens_list() {
        return allergens_list;
    }

    public void setFound_allergens(ArrayList<String> found_allergens) {
        this.found_allergens = found_allergens;
    }

    public void setIngredients(ArrayList<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }
}
