package learningjava2;

import java.util.Scanner;

public class program7 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int day = in.nextInt();
		switch(day) {
		case 1 -> System.out.println("monday");
		case 2 -> System.out.println("tuesday");
		case 3 -> System.out.println("wednesday");
		case 4 -> System.out.println("Thursday");
		case 5 -> System.out.println("friday");
		case 6 -> System.out.println("saturday");
		case 7 -> System.out.println("sunday");
		}
	}
}
