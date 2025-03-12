package SOLID.ISP.GoodPractise;

public class MyFaxMachine implements FaxMachineInterface{

    /**
     * Only use the interface the developer wants
     */
    @Override
    public void fax(String number) {
        // Logic to fax        
    }    
}
