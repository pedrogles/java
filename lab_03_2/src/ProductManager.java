import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    private final List<Product> products = new ArrayList<>();
    private float totalSales = 0;

    public void addProduct(Product product) {
        products.add(product);
    }

    public Product findProductByName(String name) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                return product;
            }
        }
        return null;
    }

    public boolean sellProduct(String name, int quantity) {
        Product product = findProductByName(name);
        if (product != null && product.getQuantity() >= quantity) {
            product.setQuantity(product.getQuantity() - quantity);
            totalSales += product.getPrice() * quantity;
            return true;
        }
        return false;
    }

    public void printProducts() {
        for (int i = 0; i < products.size(); i++) {
            System.out.println((i + 1) + ") " + products.get(i).toString());
        }
    }

    public float getTotalSales() {
        return totalSales;
    }

    public float getPotentialRevenue() {
        float potentialRevenue = 0;
        for (Product product : products) {
            potentialRevenue += product.getPrice() * product.getQuantity();
        }
        return potentialRevenue;
    }
}