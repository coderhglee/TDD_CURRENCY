package com.coderhglee.currency;

public class Bank {
    public Money reduce(Expression source, String currency) {
        Sum sum = (Sum) source;
        return sum.reduce(currency);
    }
}
