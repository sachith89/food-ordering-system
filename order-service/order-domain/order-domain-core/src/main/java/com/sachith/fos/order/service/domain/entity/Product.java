package com.sachith.fos.order.service.domain.entity;

import com.sachith.fos.order.service.domain.valueobject.Money;
import com.sachith.fos.order.service.domain.valueobject.ProductId;

public class Product extends BaseEntity<ProductId>{
    private String name;
    private Money price;

    public Product(ProductId productId, String name, Money price) {
        super.setId(productId);
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Money getPrice() {
        return price;
    }

    // No need to override the equals and hashcode methods since both defined in the BaseEntity class
}
