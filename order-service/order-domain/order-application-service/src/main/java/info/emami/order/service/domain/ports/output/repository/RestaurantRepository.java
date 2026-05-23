package info.emami.order.service.domain.ports.output.repository;

import info.emami.order.service.domain.entity.Restaurant;

import java.util.Optional;

public interface RestaurantRepository {

    Optional<Restaurant> findRestaurantInformation(Restaurant restaurant);


}
