package patterns.behavioral.cor.leave;

public class DivisionManager extends Handler {

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void processRequest(LeaveRequest request) {
        if (request.getLeaveDuration() >= 16 && request.getLeaveDuration() <= 30)
            request.setOutput("Approved");
        else {
            request.setOutput("Sorry, we are in between projects and have tight deadline");
        }
    }
}
