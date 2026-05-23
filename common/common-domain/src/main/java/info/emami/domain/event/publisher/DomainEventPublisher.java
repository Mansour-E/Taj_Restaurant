package info.emami.domain.event.publisher;

import info.emami.domain.event.DomainEvent;

public interface DomainEventPublisher <T extends DomainEvent>{

    void publish(T domainEvent);
}
