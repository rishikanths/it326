package patterns.behavioral.mediator;

public abstract class Aeroplane {
	protected AbstractMediator mediator;
	protected String name;
    protected String tailNum;
	
    public Aeroplane(AbstractMediator med, String name, String tailNum){
		this.mediator=med;
		this.name=name;
        this.tailNum=tailNum;
	}
	public String getTailNum(){
        return this.tailNum;
    }
    public abstract void send(String msg);
	public abstract void receive(String msg);
}
