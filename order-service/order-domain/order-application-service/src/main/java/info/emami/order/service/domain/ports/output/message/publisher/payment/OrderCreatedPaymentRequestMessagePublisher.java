package info.emami.order.service.domain.ports.output.message.publisher.payment;

import info.emami.domain.event.publisher.DomainEventPublisher;
import info.emami.order.service.domain.event.OrderCreatedEvent;

public interface OrderCreatedPaymentRequestMessagePublisher extends DomainEventPublisher<OrderCreatedEvent> {

}
