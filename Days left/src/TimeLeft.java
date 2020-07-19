
public class TimeLeft {
	public static long timeLeft;

	public static void main(String[] args) throws InterruptedException {
		while (true) {
			timeLeft = (1595908800000l - System.currentTimeMillis()) / 1000 / 60 / 60;
			System.out.println("There is only " + timeLeft + " Hours left until we are done english.");
		}
	}
}
