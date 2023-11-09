package ru.geekbrains.lesson4.homework;

public class InsufficientFundsException extends RuntimeException {
    private double availableBalance;

    public InsufficientFundsException(String message, double availableBalance) {
        super(message);
        this.availableBalance = availableBalance;
    }

    public double getAvailableBalance() {
        return availableBalance;
    }
}

