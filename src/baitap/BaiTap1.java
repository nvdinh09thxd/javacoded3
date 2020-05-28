package baitap;

import java.util.Scanner;

public class BaiTap1 {

	public static int chiaHetCho5(int number) {
		int n = 0;
		for (int i = 0; i <= number; i++)
			if (i % 5 == 0)
				n++;
		return n;
	}

	public static int chiaHetCho3(int number) {
		int n = 0;
		for (int i = 0; i <= number; i++)
			if (i % 3 == 0)
				n++;
		return n;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.println("Nhập n = ");
			n = sc.nextInt();
		} while (n > 100 || n < 10);
		sc.close();
		System.out.println("Trong khoảng từ 0 đến " + n + " có " + chiaHetCho5(n) + " số chia hết cho 5!");
		System.out.println("Trong khoảng từ 0 đến " + n + " có " + chiaHetCho3(n) + " số chia hết cho 3!");
	}
}
