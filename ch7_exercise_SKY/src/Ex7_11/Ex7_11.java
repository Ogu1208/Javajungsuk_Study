package Ex7_11;

class MyTv2 {
	private boolean isPowerOn;
	private int prev_ch;
	private int channel;
	private int volume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	public int getChannel() {
		return channel;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public void setChannel(int num) {
		if(num > 100|| num<1)
			return;
		prev_ch=this.channel;
		 this.channel=num;
	}
	
	public void setVolume(int num) {
		if(num > 100|| num<0)
			return;
		this.volume=num;
	}
	
	public void gotoPrevChannel() {
		int tmp=channel;
		channel = prev_ch;
		prev_ch=tmp;
	}
	
} //MyTv2


public class Ex7_11 {
	public static void main(String args[]) {
		MyTv2 t = new MyTv2();
		
		t.setChannel(10);
		System.out.println("CH:"+t.getChannel());
		t.setChannel(20);
		System.out.println("CH:"+t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:"+t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:"+t.getChannel());
		}
}

//check