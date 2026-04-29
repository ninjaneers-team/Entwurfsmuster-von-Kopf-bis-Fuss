public class Light {
	String location = "";

	public Light(String location) {
		this.location = location;
	}

	public void on() {
		System.out.println(location + " Licht ist an");
	}

	public void off() {
		System.out.println(location + " Licht ist aus");
	}
}
