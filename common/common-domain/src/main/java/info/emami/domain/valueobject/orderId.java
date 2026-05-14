package info.emami.domain.valueobject;

import java.util.UUID;

public class orderId extends BaseId<UUID> {

    public orderId(UUID value) {
        super(value);
    }
}
