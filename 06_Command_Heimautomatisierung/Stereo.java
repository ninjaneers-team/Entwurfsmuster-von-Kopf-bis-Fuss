public class Stereo {
	String location;

	public Stereo(String location) {
		this.location = location;
	}

	public void on() {
		System.out.println(location + " Stereoanlage ist an");
	}

	public void off() {
		System.out.println(location + " Stereoanlage ist aus");
	}

	public void setCD() {
		System.out.println(location + " Stereoanlage ist auf CD-Wiedergabe eingestellt");
	}

	public void setDVD() {
		System.out.println(location + " Stereoanlage ist auf DVD-Wiedergabe eingestellt");
	}

	public void setRadio() {
		System.out.println(location + " Stereoanlage ist auf Radio eingestellt");
	}

	public void setVolume(int volume) {
		// code to set the volume
		// valid range: 1-11 (after all 11 is better than 10, right?)
		System.out.println(location + " Stereo-Lautstärke auf " + volume + " eingestellt");
	}
}
