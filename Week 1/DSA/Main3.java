import java.util.Arrays;


public class Main3 {
    public static void main(String[] args) {
        System.out.println("--- E-commerce Platform Search Demonstration ---");

        Product[] products = {
            new Product("P005", "Laptop", "Electronics", 1200.00),
            new Product("P002", "Keyboard", "Electronics", 75.00),
            new Product("P008", "Mouse", "Electronics", 25.00),
            new Product("P001", "Desk Chair", "Furniture", 150.00),
            new Product("P007", "Monitor", "Electronics", 300.00),
            new Product("P003", "Smartphone", "Electronics", 800.00),
            new Product("P006", "Gaming Headset", "Accessories", 90.00),
            new Product("P004", "Webcam", "Accessories", 50.00)
        };

        // --- Linear Search ---
        System.out.println("\n--- Performing Linear Search ---");
        String targetIdLinear = "P003";
        Product foundProductLinear = LinearSearch.searchById(products, targetIdLinear);
        if (foundProductLinear != null) {
            System.out.println("Linear Search: Found product with ID " + targetIdLinear + ": " + foundProductLinear);
        } else {
            System.out.println("Linear Search: Product with ID " + targetIdLinear + " not found.");
        }

        String nonExistentIdLinear = "P999";
        Product notFoundProductLinear = LinearSearch.searchById(products, nonExistentIdLinear);
        if (notFoundProductLinear != null) {
            System.out.println("Linear Search: Found product with ID " + nonExistentIdLinear + ": " + notFoundProductLinear);
        } else {
            System.out.println("Linear Search: Product with ID " + nonExistentIdLinear + " not found.");
        }

        System.out.println("\n--- Linear Search by Name ---");
        Product[] foundByName = LinearSearch.searchByName(products, "laptop");
        System.out.println("Products found containing 'laptop': " + Arrays.toString(foundByName));

        Product[] foundByPartialName = LinearSearch.searchByName(products, "phone");
        System.out.println("Products found containing 'phone': " + Arrays.toString(foundByPartialName));


        // --- Binary Search ---
        System.out.println("\n--- Performing Binary Search ---");

        Product[] sortedProducts = Arrays.copyOf(products, products.length);
        BinarySearch.sortProducts(sortedProducts);
        System.out.println("Products array after sorting for Binary Search (by Product ID):\n" + Arrays.toString(sortedProducts));

        String targetIdBinary = "P007";
        Product foundProductBinary = BinarySearch.searchById(sortedProducts, targetIdBinary);
        if (foundProductBinary != null) {
            System.out.println("\nBinary Search: Found product with ID " + targetIdBinary + ": " + foundProductBinary);
        } else {
            System.out.println("\nBinary Search: Product with ID " + targetIdBinary + " not found.");
        }

        String nonExistentIdBinary = "P000";
        Product notFoundProductBinary = BinarySearch.searchById(sortedProducts, nonExistentIdBinary);
        if (notFoundProductBinary != null) {
            System.out.println("Binary Search: Found product with ID " + nonExistentIdBinary + ": " + notFoundProductBinary);
        } else {
            System.out.println("Binary Search: Product with ID " + nonExistentIdBinary + " not found.");
        }

        String targetIdAtStart = "P001";
        Product foundProductAtStart = BinarySearch.searchById(sortedProducts, targetIdAtStart);
        if (foundProductAtStart != null) {
            System.out.println("Binary Search: Found product with ID " + targetIdAtStart + ": " + foundProductAtStart);
        } else {
            System.out.println("Binary Search: Product with ID " + targetIdAtStart + " not found.");
        }
    }
}
