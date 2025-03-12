package unittest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BankTest {
    
    private Bank b = null;
    @Before
    public void initBankObject(){
        b = new Bank(100);
        System.out.println("This is @Before initBankObject");
    }
    @Test
    public void testCreateBankobject(){
        assertNotNull(b);
        System.out.println("This is @Test testCreateBankobject");
    }
    @Test
    public void testBankDepositPositiveValue(){
        System.out.println("This is @Test testBankDepositPositiveValue");
        double val = b.deposit(100);
        assertEquals(200,val,0);
    }
    @Test (expected = IllegalArgumentException.class)
    public void testBankDepositNegativeValue(){
        System.out.println("This is @Test testBankDepositNegativeValue");
        double val = b.deposit(-100);
    }

    @Test
    public void testWithdrawal(){
        double val = b.withdrawal(50);
        assertEquals(50,val,0);
    }

    @Test(expected = IllegalArgumentException.class)
    //@Test
    public void testBankWithdrawalLargeValue(){
        double userValue = 101;
        double val = b.withdrawal(userValue);
        assertEquals(0, val,0);
    }
}
