package �´�С_Example;

public class Example {

	public static void main(String[] args) {
		Number number = new Number();
		number.giveNumberThread.start();
		number.guessNumberThread.start();
	}
}
