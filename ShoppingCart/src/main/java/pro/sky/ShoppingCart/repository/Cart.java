package pro.sky.ShoppingCart.repository;

import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.ShoppingCart.model.Item;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
@SessionScope
public class Cart {
    private final List<Item> cart = new ArrayList<>();

    public void addAll(List<Item> items) {
        cart.addAll(items);
    }

    public List<Item> getAll(){
        return Collections.unmodifiableList(cart);
    }
}
