package info.emami.order.service.domain.valueObject;

import info.emami.domain.valueobject.BaseId;

import java.util.UUID;

public class TrackingId extends BaseId<UUID> {



    protected TrackingId(UUID value) {
        super(value);
    }
}
