
public class Test {
	public static void main(String[] args) {
		Species human = new Species("homo", "sapiens");
		System.out.println(human.toString());

		Specimen[] animals= new Specimen[10];
		animals=new Specimen[10];
		animals[0] = new Specimen("Shadow", 3, new Species("Canis lupus", "Canis"));
		animals[1] = new Specimen("Milo", 5, new Species("Felis catus", "Felis"));
		animals[2] = new Specimen("Luke", 6, new Species("Canis lupus", "Canis"));
		animals[3] = new Specimen("Kai", 1, new Species("Canis lupus", "Canis"));
		animals[4] = new Specimen("Bridget", 1, new Species("Southern giraffe", "Giraffa"));

		Species dog = new Species("Canis lupus", "Canis");

		new Test().countSpecimens(animals, dog);

	}
	

	public void countSpecimens(Specimen[] animals, Species s) {
		int countSpecimens = 0;
		for (int i = 0; i < animals.length; i++) {
			if (animals[i]!=null && s.getSpeciesName().equals(animals[i].getTOA().getSpeciesName()))
				countSpecimens++;
		}
		System.out.println(countSpecimens);
	}

}
