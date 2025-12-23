import java.util.ArrayList;
import java.util.List;

public class Order {
    private Customer customer;
    private String status;
    private List<OrderItem> orderItems = new ArrayList<>();

    public Order(Customer customer, ShoppingCart cart) {
        this.customer = customer;
        this.status = "PROCESSANDO";
        this.orderItems.addAll(cart.getProdutos());
    }
    public double calcTotal(){
        double total = 0;
        for(OrderItem itens : orderItems){
            total += itens.subTotal();
        }
        return total;
    }
    public void finalizarOrder(ShoppingCart cart){
        boolean estoqueSuficiente = true;
        for (OrderItem item : orderItems) {
            if (item.getProdutoObj().getStock() < item.getQuantity()) {
                estoqueSuficiente = false;
                break;
            }
        }

        for (OrderItem item : orderItems) {
            item.getProdutoObj().dStock(item.getQuantity());
        }
        customer.addOrder(this);
        cart.clearCart();
        this.status = "FINALIZADO";
    }

    public Customer getCustomer() {
        return customer;
    }
    public String getStatus() {
        return status;
    }
    public List<OrderItem> getOrderItems() {
        return orderItems;
    }
}
