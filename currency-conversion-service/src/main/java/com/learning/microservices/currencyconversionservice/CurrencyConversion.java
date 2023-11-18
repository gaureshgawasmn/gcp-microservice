package com.learning.microservices.currencyconversionservice;

import java.math.BigDecimal;

public class CurrencyConversion {
    private Long id;
    private String from;
    private String to;
    private BigDecimal quantity;
    private BigDecimal conversionMultiple;
    private BigDecimal totalCalculatedAmount;
    private String environment;

    public CurrencyConversion() {
    }

    public CurrencyConversion(Long id, String from, String to, BigDecimal quantity, BigDecimal conversionMultiple, BigDecimal totalCalculatedAmount, String environment) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.quantity = quantity;
        this.conversionMultiple = conversionMultiple;
        this.totalCalculatedAmount = totalCalculatedAmount;
        this.environment = environment;
    }

    public Long getId() {
        return id;
    }

    public CurrencyConversion setId(Long id) {
        this.id = id;
        return this;
    }

    public String getFrom() {
        return from;
    }

    public CurrencyConversion setFrom(String from) {
        this.from = from;
        return this;
    }

    public String getTo() {
        return to;
    }

    public CurrencyConversion setTo(String to) {
        this.to = to;
        return this;
    }

    public BigDecimal getConversionMultiple() {
        return conversionMultiple;
    }

    public CurrencyConversion setConversionMultiple(BigDecimal conversionMultiple) {
        this.conversionMultiple = conversionMultiple;
        return this;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public CurrencyConversion setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
        return this;
    }

    public BigDecimal getTotalCalculatedAmount() {
        return totalCalculatedAmount;
    }

    public CurrencyConversion setTotalCalculatedAmount(BigDecimal totalCalculatedAmount) {
        this.totalCalculatedAmount = totalCalculatedAmount;
        return this;
    }

    public String getEnvironment() {
        return environment;
    }

    public CurrencyConversion setEnvironment(String environment) {
        this.environment = environment;
        return this;
    }
}
