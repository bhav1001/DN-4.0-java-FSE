public class LinearSearch {

    public static Product searchById(Product[] products, String targetProductId) {
        if (products == null || targetProductId == null) {
            return null; 
        }

        for (int i = 0; i < products.length; i++) {
            
            if (products[i] != null && products[i].getProductId().equals(targetProductId)) {
                return products[i]; 
            }
        }
        return null; 
    }

    public static Product[] searchByName(Product[] products, String targetProductName) {
        if (products == null || targetProductName == null) {
            return new Product[0]; 
        }

        java.util.ArrayList<Product> foundProducts = new java.util.ArrayList<>();
        String lowerCaseTargetName = targetProductName.toLowerCase();

        for (Product product : products) {
            if (product != null && product.getProductName().toLowerCase().contains(lowerCaseTargetName)) {
                foundProducts.add(product);
            }
        }
        return foundProducts.toArray(new Product[0]);
    }
}