import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<OrderItem> produtos = new ArrayList<>();
    public void addProduto(Product produto, int quantity){
        OrderItem item = new OrderItem(produto, quantity);
        produtos.add(item);
    }
    public void removeProduto(Product product) {
        int indexP = -1;
        for (OrderItem produto: produtos){
            if (produto.getProduto().equals(product.getId())){
                indexP = produtos.indexOf(produto);
            }
        }
        if (indexP > -1){
            produtos.remove(indexP);
        }
    }
    public void verCart(){
        for(OrderItem produto: produtos){
            System.out.println(produto.getQuantity() + " " + produto.getProduto());
        }
    }
    public double calcTotal(){
        double total = 0;
        for (OrderItem produto: produtos){
            total += produto.subTotal();
        }
        return total;
    }
    public void clearCart(){
        if(!produtos.isEmpty()) {
            produtos.clear();
        }
    }

    public List<OrderItem> getProdutos() {
        return produtos;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "produtos=" + produtos +
                '}';
    }
}
