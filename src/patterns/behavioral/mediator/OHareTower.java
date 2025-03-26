package patterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class OHareTower implements AbstractMediator{

	private List<Aeroplane> planes = new ArrayList<>();
	
	@Override
	public void addPlane(Aeroplane a){
		this.planes.add(a);
	}
	
	@Override
	public void sendMessage(String msg, Aeroplane a) {
		for(Aeroplane temp : planes){
			if(!temp.getTailNum().equals(a.getTailNum())){
				temp.receive(msg);
			}
		}
	}

}
