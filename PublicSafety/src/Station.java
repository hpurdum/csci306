
// Authors: Cameron Fitzgerald, Henry Purdum

public class Station {
	private static final int MAX_DETECTIVES = 5;
	private String name;
	private Detective[] detectives = new Detective[MAX_DETECTIVES];
	private static int lastBadgeNumber = 0;

	public Station(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public static int getLastBadgeNumber() {
		return lastBadgeNumber;
	}
	
	public static void incLastBadgeNumber() {
		lastBadgeNumber++;
	}
	
	// function used in calculating how many of the spots are open at any given station
	public int getDetectivesLength() {
		int counter = 0;
		for(int i = 0; i < detectives.length; i++) {
			if(detectives[i]!=null) {
				counter++;
			}
		}
		return counter;
	}
	
	public Detective[] getDetectives() {
		return detectives;
	}
	
	// this function is used to create a new detective which increments the lastBadgeNumber variable and adds the detective to the station's list
	public void hire(String name, int badgeNumber) {
		Detective d = new Detective(name);
		detectives[getDetectivesLength()] = d;
	}
}