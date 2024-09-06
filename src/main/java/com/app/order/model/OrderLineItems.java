package com.app.order.model;

import java.math.BigDecimal;

import com.app.order.constants.OrderConstants;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tab_order_line_details")
@Getter
@Setter
public class OrderLineItems extends AuditableEntity<String> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = OrderConstants.FALSE)
    private Long id;

    private String skuCode;

    private BigDecimal price;

    private Integer quantity;

}
