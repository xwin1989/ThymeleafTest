package com.nx.domain;

/**
 * Created by neal.xu on 2014/10/9.
 */
public class Money {
    private Integer total;
    private double value;

    public Money(Integer total, double value) {
        this.total = total;
        this.value = value;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
