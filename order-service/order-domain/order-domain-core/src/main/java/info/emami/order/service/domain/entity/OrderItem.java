package info.emami.order.service.domain.entity;

import info.emami.domain.entity.BaseEntity;
import info.emami.domain.valueobject.Money;
import info.emami.domain.valueobject.OrderId;
import info.emami.order.service.domain.valueObject.OrderItemId;

public class OrderItem extends BaseEntity<OrderItemId> {

    private OrderId  orderId;
    private final Product product;
    private final int quantity;
    private final Money Price;
    private final Money subTotal;



    void initializeOrderItem(OrderId orderId, OrderItemId orderItemId){
        this.orderId = orderId;
        super.setId(orderItemId);
    }

    private OrderItem(Builder builder) {
        super.setId(builder.orderItemId);
        orderId = builder.orderId;
        product = builder.product;
        quantity = builder.quantity;
        Price = builder.Price;
        subTotal = builder.subTotal;
    }


    public OrderId getOrderId() {
        return orderId;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public Money getPrice() {
        return Price;
    }

    public Money getSubTotal() {
        return subTotal;
    }

    public static final class Builder {
        private OrderItemId orderItemId;
        private OrderId orderId;
        private Product product;
        private int quantity;
        private Money Price;
        private Money subTotal;

        private Builder() {
        }

        public static Builder builder() {
            return new Builder();
        }


        public Builder orderItemId(OrderItemId val) {
            orderItemId = val;
            return this;
        }

        public Builder orderId(OrderId val) {
            orderId = val;
            return this;
        }

        public Builder product(Product val) {
            product = val;
            return this;
        }

        public Builder quantity(int val) {
            quantity = val;
            return this;
        }

        public Builder Price(Money val) {
            Price = val;
            return this;
        }

        public Builder subTotal(Money val) {
            subTotal = val;
            return this;
        }

        public OrderItem build() {
            return new OrderItem(this);
        }
    }
}
