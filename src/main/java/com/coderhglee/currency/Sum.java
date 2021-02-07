package com.coderhglee.currency;

public class Sum implements Expression {
    private final Money augend;
    private final Money addend;

    public Sum(Money augend, Money addend) {
        this.augend = augend;
        this.addend = addend;
    }

    public Money augend() {
        return this.augend;
    }

    public Money addend() {
        return addend;
    }

    public Money reduce(String currency) {
        int amount = augend.amount + addend.amount;
        return new Money(amount,currency);
    }
}
