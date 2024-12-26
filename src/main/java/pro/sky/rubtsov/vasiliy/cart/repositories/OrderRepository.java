package pro.sky.rubtsov.vasiliy.cart.repositories;

import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.rubtsov.vasiliy.cart.models.Cart;

@Repository
@SessionScope
public class OrderRepository {
    private final Cart cart;

    public OrderRepository() {
        cart = new Cart();
    }

    public Cart getCart() {
        return cart;
    }
}
