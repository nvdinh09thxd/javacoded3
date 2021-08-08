package tuan;

import java.util.Scanner;

public class Bt1 {
	public static void ch3(int number) {

		int n = 0;
		for (int i = 10; i <= number; i++) {
			if (i % 3 == 0)
				n++;
		}
		System.out.println("có " + n + "số chia hết chia cho 3");

	}

	public static void ch5(int number) {
		int n = 0;
		for (int i = 10; i <= number; i++) {
			if (i % 5 == 0)
				n++;
		}
		System.out.print("có " + n + "số chia hết chia cho 5");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.println(" nhập n: ");
			n = sc.nextInt();
		} while (n < 10 || n > 100);
		System.out.print("Số " + n + "nằm trong khoảng 10 đến 100 ");
		ch3(n);
		System.out.println();
		System.out.print("Số " + n + " nằm trong khoảng 10 đến 100 ");
		ch5(n);

	}
}