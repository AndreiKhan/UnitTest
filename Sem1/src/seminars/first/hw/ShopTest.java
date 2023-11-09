package seminars.first.hw;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ShopTest {

    /*
     1. Проверить, что магазин хранит верный список продуктов (количество продуктов, состав корзины)
     2. Проверить, что магазин возвращает верный самый дорого продукт getMostExpensiveProduct
     3. Проверить, что магазин возвращает верный отсортированный по цене список продуктов
    */

    public static void main(String[] args) {

        // Создаем корзину
        Shop shop = new Shop();

        shop.addProduct(new Product(11, "qert"));
        shop.addProduct(new Product(14, "qwe"));
        shop.addProduct(new Product(67, "vbnm"));
        shop.addProduct(new Product(33, "fhfg"));
        shop.addProduct(new Product(32, "iiiii"));
        shop.addProduct(new Product(32, "jtw"));
        shop.addProduct(new Product(10, "rty"));
        shop.addProduct(new Product(10, "klp"));
        shop.addProduct(new Product(1, "xyi"));
        shop.addProduct(new Product(12, "dfg"));
        shop.addProduct(new Product(90, "xfgh"));
        shop.addProduct(new Product(1150, "asd"));
        shop.addProduct(new Product(100, "zxc"));

        // копируем список из магазина
        List<Product> products = shop.getProducts();

        // размер корзины
        assertThat(products.size()).isEqualTo(13);

        // Самый дорогой продукт
        assertThat(shop.getMostExpensiveProduct(products).getCost()).isEqualTo(1150);

        //Сортируем копию списка
        products = shop.getSortedListProducts(products);

        // Сортированный список проверяем цену последнего и первого продукта
        assertThat(products.get(0).getCost()).isEqualTo(1);
        assertThat(products.get(products.size() - 1).getCost()).isEqualTo(1150);


    }
}




