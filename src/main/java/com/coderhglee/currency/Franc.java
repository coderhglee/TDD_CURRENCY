package com.coderhglee.currency;

public class Franc extends Money {
    public Franc(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public Money times(int multiplier) {
        return Money.franc(this.amount * multiplier);
    }

    public int amount() {
        return this.amount;
    }

    @Override
    public String currency() {
        return this.currency;
    }
}
