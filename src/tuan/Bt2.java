package tuan;

import java.util.Random;
import java.util.Scanner;

public class Bt2 {
	static Scanner sc = new Scanner(System.in);
	static Random rd = new Random();

	public static int soNgauNhien() {
		int numberrd = rd.nextInt(11) + 8;
		return numberrd;
	}

	private static int soNhap() {
		System.out.println("Nhập số so sánh: ");
		int numbersc = sc.nextInt();
		return numbersc;
	}

	public static void soSanh(int numberrd, int numbersc) {
		if (numberrd > numbersc) {
			System.out.println(numberrd + ">" + numbersc);
		} else if (numbersc == numberrd) {
			System.out.println(numberrd + "=" + numbersc);
		} else {
			System.out.println(numberrd + "<" + numbersc);
		}
	}

	public static void main(String[] args) {
		Bt2 b2 = new Bt2();
		int soNhapmain=b2.soNhap();
		int soNgaunhienmain =b2.soNgauNhien();
		System.out.println("Số ngẫu nhiên: "+soNgaunhienmain);
		soSanh(soNhapmain, soNgaunhienmain);

	}
}
