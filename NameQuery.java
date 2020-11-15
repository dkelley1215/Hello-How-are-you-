import java.util.Scanner;

public class NameQuery {

	public static void main(String[] args) {
//		Circle c1 = newCircle(10);
		Scanner input = new Scanner(System.in);
		System.out.println("What is your name?");
		String firstName = input.nextLine();
//		System.out.printf("Hello %s!\n",  firstName);
		System.out.println("Hello " + firstName + "!");
		System.out.println("How are you today?");
		String howareyou = input.nextLine();
		System.out.printf("I hope the rest of your day is good! Goodbye %s!\n",  firstName);
	}
}
