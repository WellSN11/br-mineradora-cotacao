package org.br.mineradora.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.persistence.Entity;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name="quotation")
@Data
@NoArgsConstructor
public class QuotationEntity {

    @Id
    @GeneratedValue
    private Long id;

    private Date date;

    @Column(name="currency_price")
    private BigDecimal currencyPrice;

    @Column(name="pct_change")
    private String pctChange;

    private String pair;

}

