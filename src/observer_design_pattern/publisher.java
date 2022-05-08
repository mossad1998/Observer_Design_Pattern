package observer_design_pattern;

public class publisher implements Observer,DisplayElement{

	private String name;
	private String data;
	
	publisher(String name){
		this.name = name;
	}
	
	@Override
	public void update(String message) {
		// update certain observer
		data = message;	
		displayData();
	}

	@Override
	public void displayData() {
		// print data
		System.out.println(name + " received " + data);
	}

}
