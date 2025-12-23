public class Product {
    private String id;
    private String name;
    private double price;
    private int stock;

    public Product(String id, String name, double price, int stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public void dStock(int quantity){
        if (quantity <= getStock()){
            this.stock -= quantity;
        }
    }
    public void addStock(int quantity){
        if (quantity > 0){
            this.stock += quantity;
        }
    }
    public void updPrice(double newPrice){
        if (newPrice > 0){
            this.price = newPrice;
        }
    }
    public String getId() {
        return id;
    } public String getName() {
        return name;
    } public double getPrice() {
        return price;
    } public int getStock() {
        return stock;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                '}';
    }
}
