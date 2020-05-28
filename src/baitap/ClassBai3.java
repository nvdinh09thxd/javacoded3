package baitap;
import java.util.Scanner;

public class ClassBai3 {

	public ClassBai3() {

	}

	public int nhapN() {
		Scanner input = new Scanner(System.in);
		int n;
		do {
			System.out.print("Nhập vào 1 số (tối đa 3 chữ số): ");
			n = Integer.parseInt(input.nextLine());
		} while (n < 0 || n > 999);
		return n;
	}

	// phương thức đọc số 1 chữ số
	public String docSoMotChuSo(int n) {
		switch (n) {
		case 0:
			return "không";
		case 1:
			return "một";
		case 2:
			return "hai";
		case 3:
			return "ba";
		case 4:
			return "bốn";
		case 5:
			return "năm";
		case 6:
			return "sáu";
		case 7:
			return "bảy";
		case 8:
			return "tám";
		case 9:
			return "chín";
		default:
			return "";
		}
	}

	//phương thức đọc số 2 chữ số
	public String docSoHaiChuSo(int n) {
		int a = n % 10;
		int b = n / 10;
		if (n >= 10 && n <= 19) {
			if (a == 0) {
				return "mười";
			} else if (a == 5) {
				return "mười lăm";
			} else {
				return "mười " + docSoMotChuSo(a);
			}
		} else {
			if (a == 0) {
				return docSoMotChuSo(b) + " mươi";
			} else if (a == 1) {
				return docSoMotChuSo(b) + " mươi mốt";
			} else if (a == 5){
				return docSoMotChuSo(b) + " mươi lăm";
			} else {
				return docSoMotChuSo(b) + " mươi " + docSoMotChuSo(a);
			}
		}
	}

	//phương thức đọc số 3 chữ số
	public String docSoBaChuSo(int n) {
		int a = n / 100;
		int b = n % 100;
		int c = b / 10;
		int d = b % 10;
		if (c == 0) {
			if (d == 0) {
				return docSoMotChuSo(a) + " trăm";
			} else {
				return docSoMotChuSo(a) + " trăm lẻ " + docSoMotChuSo(d);
			}
		} else {
				return docSoMotChuSo(a) + " trăm " + docSoHaiChuSo(b);
		}
	}

	public void xuLy() {
		do {
			int n = nhapN();
			if (n >= 0 && n <= 9) {
				System.out.println(docSoMotChuSo(n));
			} else if (n >= 10 && n <= 99) {
				System.out.println(docSoHaiChuSo(n));
			} else {
				System.out.println(docSoBaChuSo(n));
			}
		} while (true);
	}
}
