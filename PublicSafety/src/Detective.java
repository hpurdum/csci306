
// Authors: Cameron Fitzgerald, Henry Purdum

public class Detective {
	private String name;
	private int badgeNumber;

	public Detective(String name) {
		super();
		this.name = name;
		this.badgeNumber = Station.getLastBadgeNumber() + 1;
		Station.incLastBadgeNumber();
	}

	public String getName() {
		return name;
	}

	public int getBadgeNumber() {
		return badgeNumber;
	}
	
	@Override
	public String toString() {
		return "Detective [Badge=" + badgeNumber + ", Name=" + name + "]";
	}
}