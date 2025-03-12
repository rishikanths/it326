package patterns.behavioral.cor.leave;

public class Client {
    
    public static void main(String args[]) {

        LeaveRequest request = new LeaveRequest();
        request.setLeaveDuration(14);
        Handler manager = new Manager();
        Handler superManager = new SeniorManager();
        Handler divisionManager = new DivisionManager();
        manager.setNextHandler(superManager);
        superManager.setNextHandler(divisionManager);

        manager.processRequest(request);

        System.out.println(request.getOutput());
    }

}
