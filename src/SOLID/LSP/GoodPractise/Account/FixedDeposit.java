package SOLID.LSP.GoodPractise.Account;

import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FixedDeposit extends Account {
    private final static Logger logger = Logger.getLogger(FixedDeposit.class.getSimpleName());

    @Override
    protected boolean deposit(double amount) {
        amt = amt.add(new BigDecimal(amount));
        logger.log(Level.INFO, "Added {0} to fixed deposit and total is {1}", new Object[]{amount,amt.doubleValue()});
        return true;
    }
}
