package week3.day1;

public class MyPhone {

	public static void main(String[] args) {
		Iphone ca = new Iphone();
		ca.startApp();
		ca.increaseVolume();
		ca.shutDown();
		ca.makeCall();
		ca.sendSms();
		Ipad au = new Ipad();
		au.watchMovie();
		au.startApp();
	}

}
