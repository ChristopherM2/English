
public class TimeLeft {
	public static long timeLeft;

	public static void main(String[] args) throws InterruptedException {
		
		timeLeft();
	}
	public static void timeLeft() {
		while(true)		System.out.println("There is only " + ((1595908800000l - System.currentTimeMillis()) / 1000 / 60 / 60) + " Hours left until we are done english.");


	}
}
