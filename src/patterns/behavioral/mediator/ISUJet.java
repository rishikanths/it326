package patterns.behavioral.mediator;

public class ISUJet extends Aeroplane{

	public ISUJet(AbstractMediator med, String name, String tailNum){
		super(med,name,tailNum);
	}
	
	@Override
	public void send(String msg){
		mediator.sendMessage(msg,this);
	}
	
	@Override
	public void receive(String msg){
		System.out.println(this.tailNum+"     Roger that - "+msg);
	}

}