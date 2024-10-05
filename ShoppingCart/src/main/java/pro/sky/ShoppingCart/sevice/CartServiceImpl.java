package pro.sky.ShoppingCart.sevice;

import org.springframework.stereotype.Service;
import pro.sky.ShoppingCart.model.Item;
import pro.sky.ShoppingCart.repository.Cart;

import java.util.List;

@Service
public class CartServiceImpl implements CartService {
    private final Cart cart;

    public CartServiceImpl(Cart cart) {
        this.cart = cart;
    }

    @Override
    public void add(List<Integer> itemIdes) {
        cart.addAll(itemIdes.stream()
                .map(Item::new)
                .toList());
    }

    @Override
    public List<Item> get(){
        return cart.getAll();
    }
}
