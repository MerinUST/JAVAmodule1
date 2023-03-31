package observer.subjectimpl;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

//import javax.swing.text.html.HTMLDocument.Iterator;

import observer.iface.WeatherObserver;
import observer.subject.Observable;

@SuppressWarnings("deprecation")
public class WeatherStation extends Observable {
	private List<WeatherObserver> weatherObservers;
	private int temparature;
	
	
	public void setTemparature(int temparature) {
		System.out.println("WeatherStation updating temperature to "+temparature);
		this.temparature = temparature;
		doNotify();
	}

	public WeatherStation(int temparature) {
		weatherObservers=new ArrayList<>();
		this.temparature=temparature;
	}
	
	@Override
	public void addObserver(WeatherObserver weatherObserver) {
		weatherObservers.add(weatherObserver);
		
	}

	@Override
	public void removeObserver(WeatherObserver weatherObserver) {
		weatherObservers.remove(weatherObserver);
		
	}

	@Override
	public void doNotify() {
		Iterator<WeatherObserver> iterator=weatherObservers.iterator();
		while(iterator.hasNext()) {
			WeatherObserver weatherObserver=iterator.next();
			weatherObserver.doUpdate(temparature);
		}
		
	}    

}
