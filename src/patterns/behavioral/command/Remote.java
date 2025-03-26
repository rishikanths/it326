package patterns.behavioral.command;

public class Remote {
    
    private CommandInterface command1;
    private CommandInterface command2;
	
	public void setCommands(CommandInterface c[]){
		command1 = c[0];
        command2 = c[1];
	}
	public boolean executeCommand1(){
		command1.execute();
        return true;
	}
    public boolean executeCommand2(){
		command2.execute();
        return true;
	}
}
