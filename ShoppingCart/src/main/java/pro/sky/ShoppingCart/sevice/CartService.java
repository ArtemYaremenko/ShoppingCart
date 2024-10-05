package pro.sky.ShoppingCart.sevice;

import pro.sky.ShoppingCart.model.Item;

import java.util.List;

public interface CartService {
    void add(List<Integer> itemIdes);

    List<Item> get();
}
