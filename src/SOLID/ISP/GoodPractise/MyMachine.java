package SOLID.ISP.GoodPractise;

public class MyMachine implements CopyMachineInterface,FaxMachineInterface, PrintMachineInterface, StapleMachineInterface {

    @Override
    public void copy() {
        // Logic for my machine to copy
    }

    @Override
    public void fax(String number) {
        // Logic for my machine to fax to another #
    }

    @Override
    public void staple() {
        // Logic for my machine to Staple
    }

    @Override
    public void print() {
        // Logic for my machine to print to another #
    }
    
}
