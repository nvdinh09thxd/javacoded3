package baitap;

import java.util.Scanner;

public class BaiTap3 {
	static Scanner sc = new Scanner(System.in);

	public static int nhapSo(int n) {
		int so;
		do {
			System.out.print("Nhập một số: ");
			so = sc.nextInt();
		} while (so < 0 || so > n);
		return so;
	}

	public static String docSo(int n) {
		String doc[] = new String[10];
		doc[0] = "Không";
		doc[1] = "Một";
		doc[2] = "Hai";
		doc[3] = "Ba";
		doc[4] = "Bốn";
		doc[5] = "Năm";
		doc[6] = "Sáu";
		doc[7] = "Bảy";
		doc[8] = "Tám";
		doc[9] = "Chín";
		String docTruoc;
		String docSau;
		String docSo;
		if (n / 10 == 0) { // đọc các số từ 0 đến 9
			docSo = doc[n];
		} else if (n / 100 == 0) { // đọc các số từ 10 đến 99
			doc[0] = "";
			if (n / 10 == 1) {
				docTruoc = "Mười";
			} else {
				docTruoc = doc[n / 10] + " Mươi";
				doc[1] = "Mốt";
			}
			doc[5] = "Lăm";
			docSau = doc[n % 10];
			docSo = docTruoc + " " + docSau;
		} else { // đọc các số còn lại
			if (n % 100 == 0) {// đọc các số tròn trăm
				docSo = doc[n / 100] + " Trăm";
			} else {
				docTruoc = doc[n / 100] + " Trăm ";
				if ((n / 10) % 10 == 0) {// đọc các số có chữ số 0 ở giữa
					docSau = doc[n % 10];
					docSo = docTruoc + " Lẻ " + docSau;
				} else if ((n / 10) % 10 == 1) {// đọc các số có chữ số 1 ở giữa
					doc[5] = "Lăm";
					docSau = doc[n % 10];
					docSo = docTruoc + "Mười " + docSau;
				} else {
					String docGiua;
					docGiua = doc[n / 10 % 10] + " Mươi ";
					doc[5] = "Lăm";
					doc[0] = "";
					doc[1] = "Mốt";
					docSau = doc[n % 10];
					docSo = docTruoc + docGiua + docSau;
				}
			}
		}
		return docSo;
	}

	public static void main(String[] args) {
		int number = nhapSo(999);// Nhập một số từ 0 đến 999
		System.out.println("Số " + number + " đọc là: " + docSo(number));
	}
}
