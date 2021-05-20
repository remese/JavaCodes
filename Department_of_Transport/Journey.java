
public class Journey {
	// A unique identifier for a particular route
	private String routeCode;
	// Minutes late in arriving at the destination
	private int delay;
	// Equals true if the journey is affected by the weather, // otherwise false.
	private boolean weatherRelated;
	
	public Journey(String routeCode, int delay, boolean weatherRelated) {
		this.routeCode = routeCode;
		this.delay = delay;
		this.weatherRelated = weatherRelated;
	}

	public String getRouteCode() {
		return routeCode;
	}

	public int getDelay() {
		return delay;
	}

	public boolean isWeatherRelated() {
		return weatherRelated;
	}

	public void setRouteCode(String routeCode) {
		this.routeCode = routeCode;
	}

	public void setDelay(int delay) {
		this.delay = delay;
	}

	public void setWeatherRelated(boolean weatherRelated) {
		this.weatherRelated = weatherRelated;
	}
	
	
}
