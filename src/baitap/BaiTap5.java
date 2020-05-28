package baitap;

import java.util.Scanner;

public class BaiTap5 {
	public static int tinhChuVi(int dai, int rong) {
		int chuVi;
		chuVi = 2 * (dai + rong);
		return chuVi;
	}

	public static int tinhDienTich(int dai, int rong) {
		int dienTich;
		dienTich = dai * rong;
		return dienTich;
	}

	public static void veHCN(int dai, int rong) {
		// vẽ cạnh trên
		for (int i = 1; i < dai; i++) {
			System.out.print("* ");
		}
		System.out.println("*");

		// vẽ 2 cạnh bên
		for (int i = 2; i < rong; i++) {
			for (int j = 1; j <= dai; j++) {
				if (j == 1) {
					System.out.print("* ");
				} else if (j == dai) {
					System.out.println("*");
				} else {
					System.out.print("  ");
				}
			}
		}

		// vẽ cạnh dưới
		for (int i = 1; i < dai; i++) {
			System.out.print("* ");
		}
		System.out.println("*");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập chiều dài: ");
		int chieuDai = Integer.parseInt(sc.nextLine());
		System.out.print("Nhập chiều rộng: ");
		int chieuRong = Integer.parseInt(sc.nextLine());
		sc.close();
		System.out.println("Chu vi của hình chữ nhật là: " + tinhChuVi(chieuDai, chieuRong));
		System.out.println("Diện tích của hình chữ nhật là: " + tinhDienTich(chieuDai, chieuRong));
		veHCN(chieuDai, chieuRong);
	}

}
