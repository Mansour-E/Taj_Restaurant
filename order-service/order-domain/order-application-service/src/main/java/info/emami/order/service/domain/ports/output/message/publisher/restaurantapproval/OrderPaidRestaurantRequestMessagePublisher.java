package info.emami.order.service.domain.ports.output.message.publisher.restaurantapproval;

import info.emami.domain.event.publisher.DomainEventPublisher;
import info.emami.order.service.domain.event.OrderPaidEvent;

public interface OrderPaidRestaurantRequestMessagePublisher extends DomainEventPublisher<OrderPaidEvent> {


}
