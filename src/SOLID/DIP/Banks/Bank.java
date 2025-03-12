package SOLID.DIP.Banks;

/**
 * The Abstraction that says "any bank MUST provide a logic/body to interest method"
 */
public abstract class Bank {
    
    public abstract double interest();
}
