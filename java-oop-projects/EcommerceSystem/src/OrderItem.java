public class OrderItem {
    private Product produto;
    private int quantity;

    public OrderItem(Product produto, int quantity) {
        this.produto = produto;
        setQuantity(quantity);
    }

    public double subTotal(){
        return produto.getPrice()*quantity;
    }

    private void setQuantity(int quantity) {
        if (quantity > 0){
            this.quantity = quantity;
        }
    }

    public String getProduto() {
        return produto.getId();
    } public int getQuantity() {
        return quantity;
    }
    public Product getProdutoObj(){
        return produto;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "produto=" + produto +
                ", quantity=" + quantity +
                '}';
    }
}
