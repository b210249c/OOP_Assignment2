public class Ingredient {
    private String name;
    private double quantity;
    private String unit;
    private double cost_per_unit;

    protected Ingredient(){
        this("Ingredient", 50, "Unit", 0.0);
    }

    protected Ingredient(String name, double quantity, String unit, double cost_per_unit){
        this.name = name;
        this.quantity = quantity;
        this.unit = unit;
        this.cost_per_unit = cost_per_unit;
    }

    public String getName() {
        return name;
    }

    public double getCost_per_unit() {
        return cost_per_unit;
    }

    public double getQuantity() {
        return quantity;
    }

    public String getUnit() {
        return unit;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost_per_unit(double cost_per_unit) {
        this.cost_per_unit = cost_per_unit;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
