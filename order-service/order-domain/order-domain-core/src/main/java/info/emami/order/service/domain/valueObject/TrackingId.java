package info.emami.order.service.domain.valueObject;

import info.emami.domain.valueobject.BaseId;

import java.util.UUID;

public class TrackingId extends BaseId<UUID> {



    public TrackingId(UUID value) {
        super(value);
    }
}
