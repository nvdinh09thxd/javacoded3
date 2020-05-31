package tandoan;

import java.util.Random;
import java.util.Scanner;

public class Bai2 {

	public int taoSoNgauNhien() {
		Random rd = new Random();
		int b = rd.nextInt(11) + 8;
		return b;
	}

	public int nhapMotSoTuBanPhim() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vui lòng nhập số từ bàn phím:");
		int a = Integer.parseInt(sc.nextLine());
		return a;
	}

	public void soSanh(int a, int b) {
		if (a > b) {
			System.out.println("số từ bàn phím lớn hơn số ngẫu nhiên");
		} else if (a < b) {
			System.out.println("số từ bàn phím nhỏ hơn số ngẫu nhiên");
		} else {
			System.out.println("số từ bàn phím = số ngẫu nhiên");
		}
	}

	public static void main(String[] args) {

		Bai2 num = new Bai2();

		int a = num.nhapMotSoTuBanPhim();
		int b = num.taoSoNgauNhien();
		System.out.println("Số ngẫu nhiên được tạo ra :" + b);

		num.soSanh(a, b);

	}
}
