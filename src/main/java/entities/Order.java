package entities;

import java.util.List;

public class Order {
	private int id;
    List<Meal> meals;
    Table table;
    String time;
    Payment payment;
    String description;

    public Order(List<Meal> meals, Table table, String time) {
        this.meals = meals;
        this.table = table;
        this.time = time;
    }

    public Order(List<Meal> meals, Table table, String time, String description) {
        this.meals = meals;
        this.table = table;
        this.time = time;
        this.description = description;
    }


    public int getId() {
    	return this.id;
    }
    
    public List<Meal> getMeals() {
        return meals;
    }

    public void setMeals(List<Meal> meals) {
        this.meals = meals;
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Order{" +
        		"id='" + id + '\'' +
        		", meals=" + meals +
                ", table=" + table +
                ", time='" + time + '\'' +
                ", payment=" + payment +
                ", description='" + description + '\'' +
                '}';
    }
}
