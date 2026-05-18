package info.emami.domain.valueobject;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class OrderId extends BaseId<UUID> {

    public OrderId(UUID value) {
        super(value);
    }

    List<String> hasan = new ArrayList<>();
}
