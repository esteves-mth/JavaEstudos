public class Product {
    private String name;
    private double price;
    private int quantity;

    public String getName() {
        return this.name;
    } public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return this.price;
    } public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }

    public int getQuantity() {
        return this.quantity;
    } public void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        }
    }
    
    public double calculateTotalValue(){
        return (getPrice()*getQuantity());
    }
}
