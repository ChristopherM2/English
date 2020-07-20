
public class TimeLeft {
	public static long timeLeft;

	public static void main(String[] args) throws InterruptedException {
		timeLeft();
	}

	public static void timeLeft() {
		while (true) {
			if ((1595908800000l - System.currentTimeMillis() / 1000 / 60 / 60) > 0) {
				System.out.println("There is only " + ((1595908800000l - System.currentTimeMillis()) / 1000 / 60 / 60)
						+ " Hours left until we are done english.");
			} else if ((1595908800000l - System.currentTimeMillis() / 1000 / 60 / 60) < 1) {
				System.out.println("There is only " + ((1595908800000l - System.currentTimeMillis()) / 1000 / 60)
						+ " Minitues left until we are done english.");
			} else {
				System.out.println("We have successfully escaped hell");
			}
			
		}
	}
}
