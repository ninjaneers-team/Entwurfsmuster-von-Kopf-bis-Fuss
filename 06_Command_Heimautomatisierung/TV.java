public class TV {
	String location;
	int channel;

	public TV(String location) {
		this.location = location;
	}

	public void on() {
		System.out.println("Fernseher ist an");
	}

	public void off() {
		System.out.println("Fernseher ist aus");
	}

	public void setInputChannel() {
		this.channel = 3;
		System.out.println("Kanal ist auf VCR eingestellt");
	}
}
