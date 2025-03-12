package SOLID.DIP.Banks;

public class Driver {

    public static void main(String args[]) {
        

        Bank bank = new BigBank(1000000000, 5, 36);
        Student rishi = new Student(bank); // Now the Student can take any object of bank
        System.out.println(rishi.getInerest()); 

        bank = new ISUBank(100,20,1);
        rishi = new Student(bank); // Now the Student can take any object of bank
        System.out.println(rishi.getInerest()); 

        bank = new MyBank(10,10,10);
        rishi = new Student(bank);
        System.out.println(rishi.getInerest()); 

    }
}
