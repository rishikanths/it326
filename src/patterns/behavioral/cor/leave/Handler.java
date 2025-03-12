package patterns.behavioral.cor.leave;

public abstract class Handler { 

    public Handler nextHandler;
    
    public void setNextHandler(Handler nextHandler){
        this.nextHandler = nextHandler;
    } 
    public abstract void processRequest(LeaveRequest request); 
} 
    
