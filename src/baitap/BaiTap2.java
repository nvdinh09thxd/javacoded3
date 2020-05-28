package baitap;

import java.util.Random;
import java.util.Scanner;

public class BaiTap2 {
	static Scanner sc = new Scanner(System.in);
	static Random rd = new Random();

	public static int nhapSo() {
		System.out.print("Nhập một số: ");
		return sc.nextInt();
	}

	public static int taoSoNgauNhien() {
		return rd.nextInt(11) + 8;
	}

	public static void soSanh2So(int number1, int number2) {
		if (number1 > number2)
			System.out.println("Số " + number1 + " lớn hơn số " + number2);
		else if (number1 == number2)
			System.out.println("Số " + number1 + " bằng số " + number2);
		else
			System.out.println("Số " + number1 + " bé hơn số " + number2);
	}

	public static void main(String[] args) {
		int n;
		n = nhapSo();
		int number = taoSoNgauNhien();
		System.out.println("Số ngẫu nhiên là: " + number);
		soSanh2So(n, number);
	}

}
