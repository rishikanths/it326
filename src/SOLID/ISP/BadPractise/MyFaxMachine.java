package SOLID.ISP.BadPractise;

public class MyFaxMachine implements CopyMachineInterface{

    @Override
    public void fax(String number) {
        // Logic to fax        
    }
    /**
     * Dead code. Forcing the developers to override the methods
     * they dont have any use. This deadcode doesnt add any value
     */
    @Override
    public void copy() {
    }

    @Override
    public void staple() {
    }

    @Override
    public void print() {
    }
    
}
