package patterns.behavioral.cor.leave;

public class Manager extends Handler {
    
    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
    @Override
    public void processRequest(LeaveRequest request) {
        if (request.getLeaveDuration() <= 2)
            request.setOutput("Approved");
        else {
            request.addNotes("I am happy, but its upto you");
            nextHandler.processRequest(request);
        }
    }
}
