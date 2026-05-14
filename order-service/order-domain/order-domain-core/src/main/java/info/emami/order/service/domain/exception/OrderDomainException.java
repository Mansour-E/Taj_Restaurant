package info.emami.order.service.domain.exception;

import info.emami.domain.exception.DomainException;

public class OrderDomainException extends DomainException {

    public OrderDomainException(String message){
        super(message);
    }

    public OrderDomainException(String message,Throwable cause){
        super(message,cause);
    }
}
