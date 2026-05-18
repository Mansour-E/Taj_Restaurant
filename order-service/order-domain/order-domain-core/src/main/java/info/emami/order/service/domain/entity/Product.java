package info.emami.order.service.domain.entity;

import info.emami.domain.entity.BaseEntity;
import info.emami.domain.valueobject.Money;
import info.emami.domain.valueobject.ProductId;

public class Product extends BaseEntity<ProductId>{

    private String name;
    private Money price;

    public Product(ProductId id , String name, Money price) {
        super.setId(id);
        this.name = name;
        this.price = price;
    }

    public void updateWithConfirmedNameAndPrice(String name , Money price){

        this.name = name;
        this.price = price;

    }

    public String getName() {
        return name;
    }

    public Money getPrice() {
        return price;
    }
}
