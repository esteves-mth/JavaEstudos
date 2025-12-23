import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String ID;
    private String name;
    private List<Order> orderList = new ArrayList<>();

    public Customer(String ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public void addOrder(Order pedido){
        orderList.add(pedido);
    }

    public void clearOrder(){
        if(!orderList.isEmpty()) {
            orderList.clear();
        }
    }

    public String getID() {
        return ID;
    } public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", orderList=" + orderList +
                '}';
    }
}
