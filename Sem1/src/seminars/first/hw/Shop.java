package seminars.first.hw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shop {
    private List<Product> products = new ArrayList<Product>();

    public void addProduct(Product product) {
        if(product.getCost() < 0) {
            product.setCost(0);
        }
        this.products.add(product);
    }

    // Геттеры, сеттеры:
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    /**
     * @return отсортированный по возрастанию и цене список продуктов
     */
    public static List<Product> getSortedListProducts(List<Product> products) {
        Collections.sort(products, Product.COMPARE_BY_COST);
        return products;
    }

    /**
     * @return самый дорогой продукт
     */
    public Product getMostExpensiveProduct(List<Product> products) {
        double mostExpansive = 0;
        Product expensiveProd = new Product();

        // проходимся по всему списку
        for (Product product: products) {
            //проверяем цену товара и запоминаем товар у которого цена наибольшая
            if(product.getCost() >= mostExpansive) {
                mostExpansive = product.getCost();
                expensiveProd = product;
            }
        }

        return expensiveProd;
    }
}