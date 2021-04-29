import java.util.Random;

public class Main {
	Room allRooms[];

	public static void main(String[] args) {
		Main test = new Main();
		test.allRooms = allRoomsArray();
		printallRoomsArray(test.allRooms);
		int[] emptyRooms = test.findRooms();
		for (int i = 0; i < emptyRooms.length; i++) {
			System.out.print(emptyRooms[i] + " ");
		}

		Dates dateStart = new Dates(2021, 3, 30);
		Dates dateEnd = new Dates(2021, 4, 13);
		System.out.println("\nNumber of days = " + Dates.StayDays(dateStart, dateEnd));
		
		Client client = new Client(3256, "Smith", dateStart, dateEnd, test.allRooms[4]);
		client.bill();

	}

	public static Room[] allRoomsArray() {
		Room[] allRoomsArray = new Room[20];
		for (int i = 0; i < allRoomsArray.length; i++) {
			allRoomsArray[i] = new Room(i + 1, (int) Math.round(getRandomNumbers(1, 4)), Math.random() * 100,
					new Random().nextBoolean());
		}
		return allRoomsArray;
	}

	public static void printallRoomsArray(Room[] allRooms) {
		for (int i = 0; i < allRooms.length; i++) {
			System.out.println(allRooms[i].getRoomNumber() + "\t" + allRooms[i].getBeds() + "\t"
					+ String.format("%.2f", allRooms[i].getPrice()) + "\t" + allRooms[i].isEmpty());
		}
	}

	public static double getRandomNumbers(double x1, double x2) {
		// Math.random() is used to obtain a random double value between 0.0 and 1.0,
		// excluding 1.0.
		return (x1 + Math.random() * (x2 - x1));
	}

       public int[] findRooms() {
		int n =0;
      		for(int i = 0; i < allRooms.length; i++){
      			if (allRooms[i].isEmpty() == true && allRooms[i].getBeds() == 2){
       				n = n+1;
      			}
    		}
     		int[] available = new int [n];
      		int j=0;
      		for(int i = 0; i < allRooms.length; i++){
          		if (allRooms[i].isEmpty() == true && allRooms[i].getBeds() == 2){
              			available[j] = allRooms[i].getRoomNumber();
              			j++;
          		}
      		}
		return available;
	}

}
