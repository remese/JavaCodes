
public class TemperatureConversion {

	public static void main(String[] args) {

		System.out.println("Celsius\t\tFahrenheit\t|\tFahrenheit\tCelsius");
		System.out.println("--------------------------------------------------------------------");

		double celsius = 31;
		double fahrenheit = 30;
		for (int i = 1; i <= 10; celsius++, fahrenheit += 10, i++) {
			System.out.println(celsius + "\t\t" + String.format("%1$6.1f\t", celsiusToFahrenheit(celsius)) + "\t|\t"
					+ fahrenheit + "\t\t" + String.format("%1$6.1f\t",fahrenheitToCelsius(fahrenheit)));
		}
	
	}
	
	public static double celsiusToFahrenheit(double celsius) {
		return (9.0/5)*celsius+32;
	}
	
	public static double fahrenheitToCelsius(double fahrenheit) {
		return (5.0/9)*(fahrenheit-32);
	}
	
	

}
