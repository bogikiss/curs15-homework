package ex2;

import java.util.ArrayList;
import java.util.List;

public class Shop<T extends ShopItem> {
    private String name;
    private int price;
    private Category category;
    public List<T> products = new ArrayList<>();

    public Shop() {
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", category=" + category +
                '}';
    }


    public void addItem(T item) {
        products.add(item);
    }

    public List<T> findByCategory(Category cat) {
        if (cat == null) {
            return new ArrayList<>();
        }
        List<T> byCategory = new ArrayList<>();
        for (T product : products) {
            if (product.category().equals(cat)) {
                byCategory.add(product);
            }
        }
        return byCategory;
    }

    public List<T> findWithLowerPrice(int maxPrice) {
        List<T> withLowerPrice = new ArrayList<>();
        for (T product : products) {
            if (product.price() < maxPrice) {
                withLowerPrice.add(product);
            }
        }
        return withLowerPrice;
    }

    public T findByName(String name) {
        T result = null;
        for (T product : products) {
            if (product.name().equals(name)) {
                result = product;
            }
        }
        return result;
    }

    public T removeItem(String name) {
        T removed = null;
        int i = 0;
        while (i < products.size()) {
            T product = products.get(i);
            if (product.name().equals(name)) {
                removed = product;
                products.remove(product);
                break;
            }
            i++;
        }
        return removed;
    }

}
