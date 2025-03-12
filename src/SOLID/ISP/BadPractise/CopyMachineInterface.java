package SOLID.ISP.BadPractise;

/**
 * Any concreate class that realizes this interface MUST implement
 * all the methods. 
 */
public interface CopyMachineInterface {
    public void copy();
    public void fax(String number);
    public void staple();
    public void print();
}
