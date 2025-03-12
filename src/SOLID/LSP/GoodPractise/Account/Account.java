package SOLID.LSP.GoodPractise.Account;

import java.math.BigDecimal;

/*
 * Abstraction that only supports withdrawl. 
 */
public abstract class Account {
    
    protected BigDecimal amt = new BigDecimal(0);

    protected abstract boolean deposit(double amount);
}