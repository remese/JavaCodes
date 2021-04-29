
public class Client {
	private int customerID;
	private String name;
	private Dates arrive;
	private Dates leave;
	private Room bedroom;

	public Client(int customerID, String name, Dates arrive, Dates leave, Room bedroom) {
		setCustomerID(customerID);
		setName(name);
		setArrive(arrive);
		setLeave(leave);
		setBedroom(bedroom);
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setArrive(Dates arrive) {
		this.arrive = arrive;
	}

	public void setLeave(Dates leave) {
		this.leave = leave;
	}

	public void setBedroom(Room bedroom) {
		this.bedroom = bedroom;
	}

	public int getCustomerID() {
		return this.customerID;
	}

	public String getName() {
		return this.name;
	}

	public Dates getArrive() {
		return this.arrive;
	}

	public Dates getLeave() {
		return this.leave;
	}

	public Room getBedroom() {
		return this.bedroom;
	}

	public void bill() {
		// method that calculates the bill for this client
		int stay;
		stay = Dates.StayDays(arrive, leave);
		double cost = getBedroom().getPrice() * stay;
		System.out.println("client: " + name + ", room: " + getBedroom().getRoomNumber());
		System.out.println("date arrived: " + arrive.getYear() + "." + arrive.getMonth() + "." + arrive.getDay()
				+ ", date booked out: " + leave.getYear() + "." + leave.getMonth() + "." + leave.getDay() + ", cost = "+ String.format("%.2f", cost));
	}
}
