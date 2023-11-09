package seminars.first.hw;

import java.util.Comparator;

public class Product {
    private int cost; // Стоимость продукта
    private String title; // Название

    public Product(int cost, String title) {
        this.cost = cost;
        this.title = title;
    }

    public Product() {}

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Product{" +
                "title='" + title + '\'' +
                ", cost=" + cost +
                "} \n";
    }

    public static Comparator<Product> COMPARE_BY_COST = new Comparator<Product>() {
        @Override
        public int compare(Product f, Product s) {
            return f.getCost() - s.getCost();
        }
    };
}