package ru.geekbrains.lesson4.homework;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        // к заданию 1
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите начальный баланс счета: ");
            double initialBalance = scanner.nextDouble();
            Account account = new Account(initialBalance);
            System.out.println("Начальный баланс: " + account.getBalance());

            System.out.print("Введите сумму депозита: ");
            double depositAmount = scanner.nextDouble();
            account.deposit(depositAmount);
            System.out.println("После депозита: " + account.getBalance());

            System.out.print("Введите сумму снятия: ");
            double withdrawalAmount = scanner.nextDouble();
            account.withdraw(withdrawalAmount);
            System.out.println("После снятия: " + account.getBalance());

            System.out.print("Введите сумму снятия (превышающую текущий баланс): ");
            withdrawalAmount = scanner.nextDouble();
            account.withdraw(withdrawalAmount);
            System.out.println("После снятия: " + account.getBalance());
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (InsufficientFundsException e) {
            System.out.println("Ошибка: " + e.getMessage() + ", доступный баланс: " + e.getAvailableBalance());
        }


        // к заданию 2
        try {
            Account account1 = new Account(1000.0);
            Account account2 = new Account(2000.0);

            System.out.println("Баланс до транзакции:");
            System.out.println("account1: " + account1.getBalance());
            System.out.println("account2: " + account2.getBalance());

            Transaction.transfer(account1, account2, 500.0);

            System.out.println("Баланс после транзакции:");
            System.out.println("account1: " + account1.getBalance());
            System.out.println("account2: " + account2.getBalance());
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}