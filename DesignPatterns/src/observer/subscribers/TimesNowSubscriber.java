package observer.subscribers;

import java.util.Observable;
import java.util.Observer;

import observer.Topic;

public class TimesNowSubscriber implements Observer{

	public TimesNowSubscriber(Observable obs) {
		// TODO Auto-generated constructor stub
		obs.addObserver(this);
	}
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		Topic tobj=(Topic)o;
		System.out.println("TIMES NOW EXCLUSIVE*****"+tobj.getLatestnews());
		
	}
	
	

}
