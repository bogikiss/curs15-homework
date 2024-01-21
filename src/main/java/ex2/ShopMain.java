package ex2;

import java.util.Iterator;

public class ShopMain {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Clothes clothes = new Clothes("red dress", 100, Category.NEW);
        Clothes clothes2 = new Clothes("white dress", 100, Category.NEW);
        Clothes clothes3 = new Clothes("pink dress", 100, Category.NEW);
        Fruits fruit = new Fruits("apple", 1, Category.ON_SALE);
        shop.addItem(clothes);
        shop.addItem(clothes2);
        shop.addItem(clothes3);
        shop.addItem(fruit);

        Iterator<ShopItem> iterator = shop.products.iterator();
        while (iterator.hasNext()) {
            ShopItem item = iterator.next();
            System.out.println(item.name());
        }
        System.out.println("-");

        Iterator<ShopItem> iteratorFindByCategory = shop.findByCategory(Category.NEW).iterator();
        while (iteratorFindByCategory.hasNext()) {
            ShopItem item = iteratorFindByCategory.next();
            System.out.println(item.name());
        }
        System.out.println("-");

        Iterator<ShopItem> iteratorFindWithLowerPrice = shop.findWithLowerPrice(30).iterator();
        while (iteratorFindWithLowerPrice.hasNext()) {
            ShopItem item = iteratorFindWithLowerPrice.next();
            System.out.println(item.name());
        }
        System.out.println("-");

        System.out.println(shop.findByName("red dress"));
        System.out.println("-");

        System.out.println(shop.removeItem("red dress"));
        System.out.println(shop.products);
    }
}
