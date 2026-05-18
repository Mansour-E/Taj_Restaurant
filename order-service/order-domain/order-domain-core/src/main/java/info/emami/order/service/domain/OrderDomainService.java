package info.emami.order.service.domain;

import info.emami.order.service.domain.entity.Order;
import info.emami.order.service.domain.entity.Restaurant;
import info.emami.order.service.domain.event.OrderCancelledEvent;
import info.emami.order.service.domain.event.OrderCreatedEvent;
import info.emami.order.service.domain.event.OrderPaidEvent;

import java.util.List;

public interface OrderDomainService {

   OrderCreatedEvent validateAndInitiateOrder(Order order, Restaurant restaurant);

    OrderPaidEvent payOrder(Order order);

    void approveOrder(Order order);

    OrderCancelledEvent cancelOrderPayment(Order order, List<String> failureMessages);

    void cancelOrder(Order order, List<String> failureMessages);

}
