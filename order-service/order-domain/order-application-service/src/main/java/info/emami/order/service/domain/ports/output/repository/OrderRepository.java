package info.emami.order.service.domain.ports.output.repository;

import info.emami.order.service.domain.entity.Order;
import info.emami.order.service.domain.valueObject.TrackingId;

import java.util.Optional;

public interface OrderRepository {

    Order save(Order order);

    Optional<Order>  findByTrackingId(TrackingId trackingId);
}
