package SOLID.LSP.GoodPractise.Account;

public abstract class WithdrawableAccount extends Account {
    
    protected abstract boolean withdraw(double amount);
}
