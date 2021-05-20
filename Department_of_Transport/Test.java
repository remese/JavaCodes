
public class Test {

	public static void main(String[] args) {
		TrainCompany[] allCompanies = new TrainCompany[3];
		allCompanies[0] = new TrainCompany("Southern", "T290");
		allCompanies[1] = new TrainCompany("Northern", "T400");
		allCompanies[2] = new TrainCompany("Eastern", "T155");

		Journey s = new Journey("J100", 3, false);
		Journey t = new Journey("J103", 8, true);
		Journey u = new Journey("J104", 10, true);

		allCompanies[0].addJourney(s);
		allCompanies[1].addJourney(t);
		allCompanies[0].addJourney(u);
		allCompanies[0].addJourney(new Journey("J101", 6, false));

		System.out.println(allCompanies[0].getCompanyCode());
		System.out.println(allCompanies[0].getJourney(1).getDelay());
		System.out.println(allCompanies[1].getNumberOfJourneys());

//		System.out.println(allCompanies[0].averageDelay());
//		
//		Codes[] allCodes=new Codes[10];
//		allCodes[0]=new Codes("Budapest - Vienna", "J100");
//		allCodes[1]=new Codes("Warsaw - Zagreb", "J103");
//		allCodes[2]=new Codes("Madrid - Barcelona ", "J104");
//		allCodes[3]=new Codes("Rome - Florence ", "J101");
//		
//		System.out.println(allCompanies[0].longestDelay(allCodes));
//		
//		System.out.println(allCompanies[0].toString(allCodes));

	}

}
