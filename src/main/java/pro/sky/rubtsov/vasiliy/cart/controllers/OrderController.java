package pro.sky.rubtsov.vasiliy.cart.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.rubtsov.vasiliy.cart.services.IOrderService;

import java.util.Set;

@RestController
@RequestMapping("/order")
public class OrderController {
    private final IOrderService orderService;

    public OrderController(IOrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/add")
    public void add(@RequestParam("id") Set<Integer> id) {
        for (Integer orderId : id) {
            orderService.addOrderToCart(orderId);
        }
    }

    @GetMapping("/get")
    public Set<Integer> get() {
        return orderService.getCart().getOrderIds();
    }
}
