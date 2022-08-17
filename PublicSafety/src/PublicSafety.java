
// Authors: Cameron Fitzgerald, Henry Purdum

import java.util.Scanner;
public class PublicSafety {
	private Station cityStation;
	private Station universityStation;

	public PublicSafety(String university, String city) {
		super();
		this.cityStation = new Station(city);
		this.universityStation = new Station(university);
	}

	// check boolean b to decide whether we hire for city or university
	public void doHire(boolean b) {
		Scanner scanner = new Scanner(System.in);
		if(b) {
			// check to see if city station is already maxed out on detectives
			if(cityStation.getDetectivesLength()>4) {
				System.out.println("Can't hire any more detectives for " + cityStation.getName());
				return;
			}
			// ask for new detective name
			System.out.print("New hire for " + cityStation.getName() + "...Enter detective's name: ");
			String name = scanner.nextLine();
			// call final hire function
			cityStation.hire(name, Station.getLastBadgeNumber());
		}
		else {
			// check to see if uni station is already maxed out on detectives
			if(universityStation.getDetectivesLength()>4) {
				System.out.println("Can't hire any more detectives for " + universityStation.getName());
				return;
			}
			// ask for new detective name
			System.out.print("New hire for " + universityStation.getName() + "...Enter detective's name: ");
			String name = scanner.nextLine();
			// call final hire function
			universityStation.hire(name, Station.getLastBadgeNumber());
		}
	}
	
	// this function prints out the toString functions for each detective at each Station
	public void printDetectiveLists() {
		System.out.println("List of detectives for " + cityStation.getName());
		for(int i = 0; i < cityStation.getDetectivesLength(); i++) {
			System.out.println(cityStation.getDetectives()[i].toString() + " ");
		}
		System.out.println();
		System.out.println("List of detectives for " + universityStation.getName());
		for(int i = 0; i < universityStation.getDetectivesLength(); i++) {
			System.out.println(universityStation.getDetectives()[i].toString() + " ");
		}
		System.out.println();
	}
}