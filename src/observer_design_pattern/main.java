package observer_design_pattern;

public class main {

	public static void main(String[] args) {
		// executing the pattern
		
		memberData tempMember = new memberData("Temperature");
		memberData pressureMember = new memberData("Pressure");
		
		publisher publisher = new publisher("pub1");
		StatisticsDisplay statisticsPublisher = new StatisticsDisplay("statisticspub");
		
		tempMember.registerObserver(publisher);
		tempMember.registerObserver(statisticsPublisher);
		
		pressureMember.registerObserver(publisher);
		pressureMember.registerObserver(statisticsPublisher);
		
		tempMember.sendMessage("temp is 15 C");
		pressureMember.sendMessage("pressure is 1013.25 millibars");
	}

}
