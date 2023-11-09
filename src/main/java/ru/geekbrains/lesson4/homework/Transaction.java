package ru.geekbrains.lesson4.homework;

public class Transaction {
    public static void transfer(Account fromAccount, Account toAccount, double amount) {
        try {
            fromAccount.withdraw(amount);
            toAccount.deposit(amount);
            System.out.println("Транзакция выполнена успешно.");
        } catch (InsufficientFundsException e) {
            System.out.println("Ошибка: " + e.getMessage() + ", доступный баланс: " + e.getAvailableBalance());
            throw new TransactionException("Неудачная попытка перевода средств", e);
        }
    }
}
