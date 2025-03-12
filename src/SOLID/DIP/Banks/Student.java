package SOLID.DIP.Banks;

public class Student {
    
    //Every student will access to "any bank" of type "Bank" abstraction.
    private Bank bank = null; 

    public Student(Bank b){
        this.bank = b;
    }

    public double getInerest(){
        return bank.interest();
    }

}
