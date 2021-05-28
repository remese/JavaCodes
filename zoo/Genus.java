
public class Genus {
	private String genusName;

	public Genus(String g) {
		setGenusName(g);
	}

	public void setGenusName(String g) {
		genusName = g;
	}

	public String getGenusName() {
		return genusName;
	}

	public String toString() {
		return "Genus: " + genusName;
	}
}
