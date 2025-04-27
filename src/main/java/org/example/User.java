package org.example;

public class User {

    private int userId;
    private String name;
    private Expenses expenses;
    private long Owes = 0;
    private long balance = 0;

    public User() {
    }

    public User(int userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Expenses getExpenses() {
        return expenses;
    }

    public void setExpenses(Expenses expenses) {
        this.expenses = expenses;
    }

    public long getOwes() {
        return Owes;
    }

    public void setOwes(long owes) {
        Owes = owes;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", expenses=" + expenses +
                ", Owes=" + Owes +
                ", balance=" + balance +
                '}';
    }
}
