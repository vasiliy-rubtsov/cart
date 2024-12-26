package pro.sky.rubtsov.vasiliy.cart.services;

import pro.sky.rubtsov.vasiliy.cart.models.Cart;

public interface IOrderService {

    void addOrderToCart(Integer id);

    Cart getCart();
}
