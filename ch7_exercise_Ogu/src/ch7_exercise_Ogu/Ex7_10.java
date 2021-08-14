package ch7_exercise_Ogu;

class MyTv2 {
	private boolean isPowerOn;
	private int channel;
	private int volume;
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;

	public void setPowerOn() {
		this.isPowerOn = !isPowerOn;
	}
	
	public int getChannel() {
		return channel;
	}
	
	public void setChannel(int channel) {
		if(channel<MIN_CHANNEL || channel > MAX_CHANNEL)
			return;
		this.channel = channel;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public void setVolume(int volume) {
		if(volume<MIN_VOLUME || volume>MAX_VOLUME)
			return;
		this.volume = volume;
	}
}

public class Ex7_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyTv2 t = new MyTv2();
		t.setChannel(10);
		System.out.println("CH:"+t.getChannel());
		t.setVolume(20);
		System.out.println("VOL:"+t.getVolume());

	}

}
