package entities;

public class Meal {
	private int id;
    private String name;
    private double price;
    private String ingredients;
//    private Attachment picture
    private MealType type;
//    private String specialType;
    private String preparationTime;
    private boolean available;
    private String description;

    public Meal(){}

    public Meal(String name, double price, String ingredients, MealType mealType, String preparationTime, boolean available, String description) {
        this.name = name;
        this.price = price;
        this.ingredients = ingredients;
        this.type = mealType;
        this.preparationTime = preparationTime;
        this.available = available;
        this.description = description;
    }

    public int getId() {
    	return id;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public MealType getType() {
        return type;
    }

    public void setType(MealType type) {
        this.type = type;
    }

    public String getPreparationTime() {
        return preparationTime;
    }

    public void setPreparationTime(String preparationTime) {
        this.preparationTime = preparationTime;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Meal{" +
        		"id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", ingredients='" + ingredients + '\'' +
                ", mealType=" + type +
                ", preparationTime='" + preparationTime + '\'' +
                ", available=" + available +
                ", description='" + description + '\'' +
                '}';
    }
}
