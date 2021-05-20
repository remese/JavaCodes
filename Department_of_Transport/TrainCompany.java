
public class TrainCompany {
	private String companyName;
	private String companyCode;
	private int numberOfJourneys;
	private Journey[] journeyHistory = new Journey[100000];

	public TrainCompany(String x, String y) {
		this.companyName = x;
		this.companyCode = y;
		this.numberOfJourneys = 0;
	}

	public TrainCompany() {

	}

	public String getCompanyName() {
		return companyName;
	}

	public String getCompanyCode() {
		return companyCode;
	}

	public int getNumberOfJourneys() {
		return numberOfJourneys;
	}

	public Journey[] getJourneyHistory() {
		return journeyHistory;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public void setNumberOfJourneys(int numberOfJourneys) {
		this.numberOfJourneys = numberOfJourneys;
	}

	public void setJourneyHistory(Journey[] journeyHistory) {
		this.journeyHistory = journeyHistory;
	}

	Journey getJourney(int x) {
		return journeyHistory[x];
	}

	public void addJourney(Journey j) {
		journeyHistory[numberOfJourneys] = j;
		numberOfJourneys++;
	}

	public double averageDelay() {
		// returns the average delay for all of a company’s journeys
		// assume that each TrainCompany object has at least one journey
		return 0;
	}

	public String longestDelay(Codes[] c) {
		// returns the route name for the journey with the longest delay
		return null;
	}

	public String toString(Codes[] c) {
		// code missing
		return null;
	}

}
