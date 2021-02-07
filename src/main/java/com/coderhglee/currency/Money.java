package com.coderhglee.currency;

import java.util.Objects;

public abstract class Money {
    protected int amount;
    protected String currency;

    public static Money dollar(int amount) {
        return new Dollar(amount,"USD");
    }

    public static Franc franc(int amount) {
        return new Franc(amount,"CHF");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Money money = (Money) o;
        return amount == money.amount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }

    public abstract Money times(int multiplier);

    public abstract String currency();
}