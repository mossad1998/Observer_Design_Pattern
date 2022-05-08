package observer_design_pattern;

import java.util.ArrayList;
import java.util.List;

public class memberData implements Subject{

	private String name;
	private String message;
	
	private List<Observer> observerList;
	
	public memberData(String name) {
		this.name = name;
		this.observerList = new ArrayList<>();
	}
	
	@Override
	public void registerObserver(Observer observer) {
		//make member data to register
		this.observerList.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		//remove member data from the list 
		this.observerList.remove(observer);
	}

	@Override
	public void notifyObservers() {
		// update all observers
		for(Observer observer:observerList) {
			observer.update(message);
		}
	}
	
	public void sendMessage(String message) {
		this.message = message;
		notifyObservers();
	}

}
