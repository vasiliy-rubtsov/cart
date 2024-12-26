package pro.sky.rubtsov.vasiliy.cart.services;

import org.springframework.stereotype.Service;
import pro.sky.rubtsov.vasiliy.cart.models.Cart;
import pro.sky.rubtsov.vasiliy.cart.repositories.OrderRepository;

@Service
public class OrderService implements IOrderService {

    private final OrderRepository orderRepository;
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public void addOrderToCart(Integer id) {
        orderRepository.getCart().getOrderIds().add(id);
    }

    @Override
    public Cart getCart() {
        return orderRepository.getCart();
    }
}
