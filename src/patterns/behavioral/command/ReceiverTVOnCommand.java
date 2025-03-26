package patterns.behavioral.command;

public class ReceiverTVOnCommand implements CommandInterface{
	
	public ReceiverTV livingRoomTV;
	
	public ReceiverTVOnCommand(ReceiverTV t){
		livingRoomTV  = t;
	}
    @Override
	public void execute(){
		livingRoomTV.on();
	}
}