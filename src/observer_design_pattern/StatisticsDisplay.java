package observer_design_pattern;

public class StatisticsDisplay implements Observer,DisplayElement{

	private String name;
	private String data;
	
	StatisticsDisplay(String name){
		this.name = name;
	}
	
	@Override
	public void update(String message) {
		// update certain observer with different implementation
		data = message;	
		displayData();
	}

	@Override
	public void displayData() {
		// print data
		System.out.println(name + " received " + data);
	}

}
