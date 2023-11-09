package ru.geekbrains.lesson4.homework;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите начальный баланс счета 1: ");
            double initialBalance1 = scanner.nextDouble();
            Account account1 = new DebitAccount(initialBalance1);
            System.out.println("Начальный баланс счета 1: " + account1.getBalance());

            System.out.print("Введите начальный баланс счета 2: ");
            double initialBalance2 = scanner.nextDouble();
            Account account2 = new CreditAccount(initialBalance2);
            System.out.println("Начальный баланс счета 2: " + account2.getBalance());

            System.out.print("Введите сумму для перевода: ");
            double transferAmount = scanner.nextDouble();
            Transaction.transfer(account1, account2, transferAmount);
            System.out.println("Баланс счета 1 после перевода: " + account1.getBalance());
            System.out.println("Баланс счета 2 после перевода: " + account2.getBalance());
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (TransactionException e) {
            System.out.println("Ошибка при транзакции: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

