package patterns.behavioral.command;

public class ReceiverTVOffCommand implements CommandInterface{
	
	public ReceiverTV livingRoomTV;
	
	public ReceiverTVOffCommand(ReceiverTV t){
		livingRoomTV  = t;
	}
    @Override
	public void execute(){
		livingRoomTV.off();
	}
}