package patterns.behavioral.cor.leave;

public class SeniorManager extends Handler {

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void processRequest(LeaveRequest request) {
        if (request.getLeaveDuration() >= 3 && request.getLeaveDuration() <= 15)
            request.setOutput("Approved");
        else {
            request.addNotes("I agree, but its upto you");
            nextHandler.processRequest(request);
        }
    }
}
