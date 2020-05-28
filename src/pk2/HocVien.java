package pk2;

import java.util.Scanner;

public class HocVien {
	private int maHV;
	private String hoTen;
	private float diemTB;

	public HocVien() {

	}

	public HocVien(int maHV, String hoTen, float diemTB) {
		super();
		this.maHV = maHV;
		this.hoTen = hoTen;
		this.diemTB = diemTB;
	}

	public int getMaHV() {
		return maHV;
	}

	public void setMaHV(int maHV) {
		this.maHV = maHV;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public float getDiemTB() {
		return diemTB;
	}

	public void setDiemTB(float diemTB) {
		this.diemTB = diemTB;
	}

	public void nhapThongTin() {
		Scanner input = new Scanner(System.in);
		System.out.print("Nhập mã học viên: ");
		int ma = Integer.parseInt(input.nextLine());
		System.out.print("Nhập họ tên học viên: ");
		String hoTen = input.nextLine();
		System.out.print("Nhập điểm trung bình: ");
		float diemTB = Float.parseFloat(input.nextLine());
		setMaHV(ma);
		setHoTen(hoTen);
		setDiemTB(diemTB);
	}

	public void soSanhDiemTB(HocVien hv1, HocVien hv2) {
		if (hv1.diemTB < hv2.diemTB) {
			System.out.println("Điểm TB của " + hv1.getHoTen() + " < Điểm TB của " + hv2.getHoTen());
		} else if (hv1.diemTB > hv2.diemTB) {
			System.out.println("Điểm TB của " + hv1.getHoTen() + " > Điểm TB của " + hv2.getHoTen());
		} else {
			System.out.println("Điểm TB của " + hv1.getHoTen() + " = Điểm TB của " + hv2.getHoTen());
		}
	}

	public void kiemTraId() {
		if (getMaHV() % 2 == 0) {
			System.out.println("Id của học viên " + getHoTen() + " chẵn");
		} else {
			System.out.println("Id của học viên " + getHoTen() + " lẻ");
		}
	}
}
