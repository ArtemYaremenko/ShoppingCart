package pro.sky.ShoppingCart.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.ShoppingCart.model.Item;
import pro.sky.ShoppingCart.sevice.CartService;

import java.util.List;

@RestController
@RequestMapping("/order")
public class CartController {

    private final CartService service;

    public CartController(CartService service) {
        this.service = service;
    }

    @GetMapping("/add")
    public void add(@RequestParam("itemId") List<Integer> itemIdes) {
        service.add(itemIdes);
    }

    @GetMapping("/get")
    public List<Item> get() {
        return service.get();
    }

}
