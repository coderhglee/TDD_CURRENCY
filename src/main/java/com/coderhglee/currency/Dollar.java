package com.coderhglee.currency;

public class Dollar extends Money {
    public Dollar(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public Money times(int multiplier) {
        return Money.dollar(this.amount * multiplier);
    }

    public int amount() {
        return this.amount;
    }

    @Override
    public String currency() {
        return this.currency;
    }
}

