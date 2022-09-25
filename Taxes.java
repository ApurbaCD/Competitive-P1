
import java.util.Scanner;

public class Taxes {
	public static void main(String[] args) {
		String s1, s2, s3;
		double input, output;
		s2 = "single";
		s3 = "married";

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the status");
		s1 = sc.nextLine();
		System.out.println(s1);
		input = sc.nextInt();
		if (s1.equals(s2)) {
			if (0 < input && input < 8000) {
				System.out.println("" + input);
				System.out.print("" + ((input * 10) / 100));
			}

			if (8000 <= input && input < 32000) {
				System.out.println("" + input);
				System.out.print("" + (((input * 15) / 100) + 800));
			}
			if (32000 <= input) {
				System.out.println("" + input);
				System.out.print("" + (((input * 25) / 100) + 4400));


			}
		}
		if (s1.equals(s3)) {
			if (0 < input && input < 16000) {
				System.out.println("" + input);
				System.out.print("" + ((input * 10) / 100));
			}

			if (16000 <= input && input < 64000) {
				System.out.println("" + input);
				System.out.print("" + (((input * 15) / 100) + 1600));
			}
			if (64000 <= input) {
				System.out.println("" + input);
				System.out.print("" + (((input * 25) / 100) + 8800));


			}
		}

	}
}

