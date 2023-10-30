package bai08;

import java.text.NumberFormat;
import java.util.Locale;

public class Account {
	private long accountNumber;
	private String name;
	private double balance;
	private final double RATE=0.035;
	
    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        if (accountNumber < 0)
            accountNumber = 999999;
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() == 0 || name.equals(""))
            name = "Chưa xác định";
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }


    public void setBalance(double balance) {
        if (balance < 50000)
            balance = 50000;
        this.balance = balance;
    }

    public Account() {
        this.accountNumber = 999999;
        this.name = "Chưa Xác Định";
        this.balance = 50000;
    }

    public Account(long accountNumber, String name, double balance) {
        setAccountNumber(accountNumber);
        setName(name);
        setBalance(balance);
    }

    public Account(long accountNumber, String name) {
        setAccountNumber(accountNumber);
        setName(name);
        this.balance = 50000;
    }

    public boolean deposit(double amount) {
        if (amount <= 0)
            return false;
        balance += amount;
        return true;
    }

    public boolean withdraw(double amount, double fee) {
        if (amount <= 0 && balance <= amount + fee)
            return false;
        balance -= amount + fee;
        return true;
    }

    public void addInterest() {
        balance += balance * RATE;
    }

    public boolean transfer(Account acc2, double amount) {
        if(!acc2.deposit(amount))
            return false;
        // acc2.deposit(amount);
        balance -= amount;
        return true;
    }

    public static String tieuDe() {
        return String.format("%-20s %10s %20s\n%-20s", "Họ và Tên", "Số TK", "Số Dư", "=====================================================");
    }

    public String toString() {
        Locale local = new Locale("vi", "vn");
        NumberFormat formatter = NumberFormat.getCurrencyInstance(local);
        return String.format("%-20s %10d %20s", name, accountNumber, formatter.format(balance));
    }
}
