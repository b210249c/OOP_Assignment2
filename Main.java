//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Pancake recipe
        Recipe pancakeRecipe = new Recipe("Pancakes", "A pancake is a breakfast dish, a flat cake that is made by pouring batter into a hot pan and frying it on both sides.");

        // Add ingredients to the pancake recipe
        pancakeRecipe.addIngredient(new Ingredient("Wheat Flour", 500, "grams", 0.005));
        pancakeRecipe.addIngredient(new Ingredient("Egg", 2, "pcs", 0.5));
        pancakeRecipe.addIngredient(new Ingredient("Milk", 1, "liter", 1.5));
        pancakeRecipe.addIngredient(new Ingredient("Sugar", 200, "grams", 0.005));
        pancakeRecipe.addIngredient(new Ingredient("Butter", 100, "grams", 0.005));

        // Display the pancake recipe details
        System.out.println(pancakeRecipe);


        // Garlic Chicken Recipe
        Recipe chickenRecipe = new Recipe("Garlic Chicken", "Tender chicken breast cooked with garlic, onions, and olive oil, perfectly seasoned with salt for a simple yet flavorful dish.");

        // Add ingredients to the garlic chicken recipe
        chickenRecipe.addIngredient(new Ingredient("Chicken Breast", 500, "grams", 0.02));
        chickenRecipe.addIngredient(new Ingredient("Olive Oil", 50, "ml", 0.14));
        chickenRecipe.addIngredient(new Ingredient("Garlic", 3, "cloves", 0.1));
        chickenRecipe.addIngredient(new Ingredient("Onion", 1, "pcs", 0.5));
        chickenRecipe.addIngredient(new Ingredient("Salt", 10, "grams", 0.02));

        // Display the garlic chicken recipe
        System.out.println(chickenRecipe);



        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Compared 2 Recipes: ");
        // Compare the cost of the two recipes
        int comparison = pancakeRecipe.compareTo(chickenRecipe);
        if (comparison < 0) {
            System.out.println(pancakeRecipe.getName() + " is cheaper than " + chickenRecipe.getName());
        } else if (comparison > 0) {
            System.out.println(pancakeRecipe.getName() + " is more expensive than " + chickenRecipe.getName());
        } else {
            System.out.println(pancakeRecipe.getName() + " and " + chickenRecipe.getName() + " cost the same.");
        }

        System.out.println("--------------------------------------------------------------------------");
    }
}
