package tandoan;

import java.util.Scanner;

public class Bai5 {
	int cd, cr, cv, dt;

	public void nhapDL() {
		do {
			Scanner nhap = new Scanner(System.in);
			System.out.println("Nhap chieu dai:");
			cd = nhap.nextInt();
			System.out.println("Nhap chieu rong:");
			cr = nhap.nextInt();
		} while (cd < cr);

	}

	public int dientich() {
		dt = cd * cr;
		return dt;
	}

	public int chuvi() {
		cv = 2 * (cd + cr);
		return cv;
	}

	public void veHinhChuNhat(int cd, int cr) {
		for (int i = 0; i < cd; i++) {
			for (int j = 0; j < cr; j++) {
				if (i == 0 || i == cd - 1 || j == 0 || j == cr - 1)
					System.out.print(" * ");
				else
					System.out.print("   ");
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {

		Bai5 tinh = new Bai5();

		tinh.chuvi();
		tinh.dientich();
		tinh.nhapDL();

		System.out.println("Chu vi: " + tinh.chuvi());
		System.out.println("Diên tích: " + tinh.dientich());
		System.out.println("Hình chữ nhật được vẽ như sau: ");
		tinh.veHinhChuNhat(tinh.cd, tinh.cr);

	}
}
