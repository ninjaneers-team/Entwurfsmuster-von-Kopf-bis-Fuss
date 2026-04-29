public class Hottub {
	boolean on;
	int temperature;

	public Hottub() {
	}

	public void on() {
		on = true;
	}

	public void off() {
		on = false;
	}

	public void bubblesOn() {
		if (on) {
			System.out.println("Whirlpool sprudelt!");
		}
	}

	public void bubblesOff() {
		if (on) {
			System.out.println("Whirlpool sprudelt nicht mehr");
		}
	}

	public void jetsOn() {
		if (on) {
			System.out.println("Whirlpool-Düsen sind an");
		}
	}

	public void jetsOff() {
		if (on) {
			System.out.println("Whirlpool-Düsen sind aus");
		}
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	public void heat() {
		temperature = 105;
		System.out.println("Whirlpool heizt auf dampfende 105 Grad auf");
	}

	public void cool() {
		temperature = 98;
		System.out.println("Whirlpool kühlt auf 98 Grad ab");
	}

}
