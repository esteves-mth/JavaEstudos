public class ProductTest {
    public static void main(String[] args) {
        Product p = new Product("Laptop", 2900, 3 );
        System.out.println(p.getName());
        System.out.println(p.getPrice());
        System.out.println(p.getQuantity());
        System.out.println(p.calculateTotalValue());
        System.out.println();

        Product p2 = new Product("Apple", -10, -1);
        System.out.println(p2.getPrice());
        System.out.println(p2.getQuantity());
        p2.setQuantity(3);
        p2.setPrice(2);
        System.out.println(p2.getName());
        System.out.println(p2.getPrice());
        System.out.println(p2.getQuantity());
        System.out.println(p2.calculateTotalValue());
    }
}
