

public class Report {
	String name;
	String report;
	String reportType;
	Bill bill;

	public Report(String name, Bill bill) {
		super();
		this.name = name;
		this.bill = bill;
	}

	public void generateReport(String reportType) {
		if (reportType.equalsIgnoreCase("CSV")) {
			report = "CSV Report: " + name + "'s bill is " + bill.bill;
		}
		if (reportType.equalsIgnoreCase("XML")) {
			report = "XML Report: " + name + "'s bill is " + bill.bill;
		}
	}

	public String getReport() {
		return report;
	}
}