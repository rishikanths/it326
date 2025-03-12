package SOLID.LSP.GoodPractise.Account;

import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CheckingAccount extends WithdrawableAccount {

    private final static Logger logger = Logger.getLogger(CheckingAccount.class.getSimpleName());

    @Override
    protected boolean deposit(double amount) {
        amt = amt.add(new BigDecimal(amount));
        logger.log(Level.INFO, "Added {0} to checking account and total is {1}", new Object[]{amount,amt.doubleValue()});
        return true;
    }

    @Override
    protected boolean withdraw(double amount) {
        amt = amt.subtract(new BigDecimal(amount));
        logger.log(Level.INFO, "Withdrawn {0} from checking account and total is {1}", new Object[]{amount,amt.doubleValue()});
        return true;
    }
    
}
