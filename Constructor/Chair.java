public class Chair {
	private String color;
	private int wheels;

	public Chair() {
		color = "UnknownColor";
		wheels = 0;
	}

	public Chair(String c, int w) {
		color = c;
		wheels = w;
	}

	public String getColor() {
		return color;
	}

	public int getWheels() {
		return wheels;
	}
}
