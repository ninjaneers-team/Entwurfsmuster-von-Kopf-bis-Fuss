public class GarageDoor {
	String location;

	public GarageDoor(String location) {
		this.location = location;
	}

	public void up() {
		System.out.println(location + " Garagentor ist offen");
	}

	public void down() {
		System.out.println(location + " Garagentor ist geschlossen");
	}

	public void stop() {
		System.out.println(location + " Garagentor angehalten");
	}

	public void lightOn() {
		System.out.println(location + " Garagenlicht ist an");
	}

	public void lightOff() {
		System.out.println(location + " Garagenlicht ist aus");
	}
}
