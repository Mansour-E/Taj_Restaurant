package info.emami.order.service.domain.valueObject;

import info.emami.domain.valueobject.BaseId;

public class OrderItemId extends BaseId<Long> {

    public OrderItemId(Long id) {
        super(id);
    }
}
