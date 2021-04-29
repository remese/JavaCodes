import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Dates {
	private int year;
	private int month;
	private int day;
	

	public Dates(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}

	public static int StayDays(Dates x, Dates y) {
		// method that calculates the number of nights between x and y
		LocalDate dateStart= LocalDate.of(x.year, x.month, x.day);
		LocalDate dateEnd = LocalDate.of(y.year, y.month, y.day);
		int diffInDays = (int)dateStart.until(dateEnd, ChronoUnit.DAYS);
		return diffInDays;
	}
}
