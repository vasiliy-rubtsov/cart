package pro.sky.rubtsov.vasiliy.cart.models;

import java.util.HashSet;
import java.util.Set;

public class Cart {
    private final Set<Integer> orderIds;

    public Cart() {
        orderIds = new HashSet<>();
    }

    public Set<Integer> getOrderIds() {
        return orderIds;
    }
}
