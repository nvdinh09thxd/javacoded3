package tuan;

import java.util.Scanner;

public class Bt5 {
	public static int chuVi(int d, int r) {
		int chuVi = 0;
		return chuVi = (d + r) * 2;
	}

	public static int dienTich(int d, int r) {
		int dienTich = 0;
		return dienTich = d * r;
	}

	public static void hinh(int d, int r) {
		// cạnh dài trên
		for (int i = 1; i < d; i++) {
			System.out.println("*");
		}
		// 2 cạnh rộng
		for (int i = 2; i < r; i++) {
			for (int j = 1; i <= d; j++) {
				if (j == 1) {
					System.out.println("*");
				} else if (j == d) {
					System.out.println("*");
				} else {
					System.out.println(" ");

				}
			}
		}
		// cạnh dài dưới
		for (int i = 1; i < d; i++) {
			System.out.println("*");
		}
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Nhập chiều dài");
		int dh= Integer.parseInt(sc.nextLine());
		System.out.println("Nhập chiều dài");
		int rh= Integer.parseInt(sc.nextLine());
		System.out.println(" Chu Vi HCN là: "+ chuVi(dh, rh));
		System.out.println(" Diện Tích HCN là: "+ dienTich(dh, rh));
		hinh(dh, rh);

	}
}
