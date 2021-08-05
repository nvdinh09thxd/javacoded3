package tandoan;

import java.util.Scanner;

public class Bai1 {
	public static void dem(int n) {
		int chiahet3 = 0;
		int chiahet5 = 0;
		for (int i = 0; i <= n; i++) {
			if (i % 3 == 0) {
				chiahet3++;

			}
			if (i % 5 == 0) {
				chiahet5++;
			}

		}
		System.out.println("có " + chiahet3 + " số chia hết cho 3");
		System.out.println("có " + chiahet5 + " số chia hết cho 5");
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		do {
			System.out.println("nhập n:");
			n = input.nextInt();
		} while (n < 10 || n > 100);
		dem(n);

	}

}
