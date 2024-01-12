import models.*;

import java.util.Optional;

public class DemoOrdering {
    public static void main(String[] args) {
        Product toothbrush = Catalogue.getProduct("Electric Toothbrush");
        Product malayalamMusic = Catalogue.getProduct("Music");
        ShoppingCart cart = new ShoppingCart();
        cart.addLineItem(new LineItem(toothbrush,1));
        cart.addLineItem(new LineItem(malayalamMusic,1));
        System.out.println(cart.getTotalCost());
        Customer Ram = new Customer("Ram",90909090);
        Order order = Ram.checkout(cart);
        System.out.println(order);
    }
}
