package info.emami.order.service.domain.ports.input.service;

import info.emami.order.service.domain.dto.create.CreateOrderCommand;
import info.emami.order.service.domain.dto.create.CreateOrderResponse;
import info.emami.order.service.domain.dto.track.TrackOrderQuery;
import info.emami.order.service.domain.dto.track.TrackOrderResponse;

import javax.validation.Valid;

public interface OrderApplicationService {

    CreateOrderResponse createOrder(@Valid CreateOrderCommand createOrderCommand);

    TrackOrderResponse trackOrder(@Valid TrackOrderQuery trackOrderQuery);

}
