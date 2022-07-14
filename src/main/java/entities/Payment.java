package entities;

public class Payment {
	private int id;
    private Order order;
    private double amount;
    private boolean paid;

    public Payment(Order order, double amount) {
        this.order = order;
        this.amount = amount;
    }
    

    public int getId() {
    	return this.id;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    @Override
    public String toString() {
        return "Payment{" +
        		"id='" + id + '\'' +
        		", order=" + order +
                ", amount=" + amount +
                ", paid=" + paid +
                '}';
    }
}
