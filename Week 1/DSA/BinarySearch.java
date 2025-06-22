import java.util.Arrays; 

public class BinarySearch {

    public static Product searchById(Product[] products, String targetProductId) {
        if (products == null || targetProductId == null) {
            return null;
        }

        int low = 0;
        int high = products.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2; 
            Product midProduct = products[mid];

            if (midProduct == null) {
                if (targetProductId.compareTo(products[low].getProductId()) < 0) {
                    high = mid -1;
                } else {
                    low = mid + 1;
                }
                continue; 
            }

            int comparison = targetProductId.compareTo(midProduct.getProductId());

            if (comparison == 0) {
                return midProduct; 
            } else if (comparison < 0) {
                high = mid - 1;
            } else {
                low = mid + 1; 
            }
        }
        return null; 
    }

    public static void sortProducts(Product[] products) {
        if (products != null) {
            Arrays.sort(products); 
        }
    }
}