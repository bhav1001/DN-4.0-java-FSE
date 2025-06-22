import java.util.Objects;

public class Product implements Comparable<Product> {
    private String productId;
    private String productName;
    private String category;
    private double price; 

    public Product(String productId, String productName, String category, double price) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
        this.price = price;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{id='" + productId + "', name='" + productName + "', category='" + category + "', price=" + price + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 &&
               Objects.equals(productId, product.productId) &&
               Objects.equals(productName, product.productName) &&
               Objects.equals(category, product.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, productName, category, price);
    }

    @Override
    public int compareTo(Product other) {
        return this.productId.compareTo(other.productId);
    }
}
