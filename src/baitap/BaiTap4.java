package baitap;

import java.util.Scanner;

public class BaiTap4 {
	String MaHV;
	String TenHV;
	String Lop;
	int diemJava;
	int diemOracle;
	int diemProject;

	public String getMaHV() {
		return MaHV;
	}

	public void setMaHV(String maHV) {
		MaHV = maHV;
	}

	public String getTenHV() {
		return TenHV;
	}

	public void setTenHV(String tenHV) {
		TenHV = tenHV;
	}

	public String getLop() {
		return Lop;
	}

	public void setLop(String lop) {
		Lop = lop;
	}

	public int getDiemJava() {
		return diemJava;
	}

	public void setDiemJava(int diemJava) {
		this.diemJava = diemJava;
	}

	public int getDiemOracle() {
		return diemOracle;
	}

	public void setDiemOracle(int diemOracle) {
		this.diemOracle = diemOracle;
	}

	public int getDiemProject() {
		return diemProject;
	}

	public void setDiemProject(int diemProject) {
		this.diemProject = diemProject;
	}

	public BaiTap4(String maHV, String tenHV, String lop, int diemJava, int diemOracle, int diemProject) {
		super();
		MaHV = maHV;
		TenHV = tenHV;
		Lop = lop;
		this.diemJava = diemJava;
		this.diemOracle = diemOracle;
		this.diemProject = diemProject;
	}

	public BaiTap4() {
		super();
	}

	public static Scanner sc = new Scanner(System.in);

	public BaiTap4 inputData() { // Phương thức nhập thông tin từ bàn phím
		System.out.print("Nhập mã học viên: ");
		this.MaHV = sc.nextLine();
		System.out.print("Nhập tên học viên: ");
		this.TenHV = sc.nextLine();
		System.out.print("Nhập lớp: ");
		this.Lop = sc.nextLine();
		System.out.print("Nhập điểm Java: ");
		this.diemJava = Integer.parseInt(sc.nextLine());
		System.out.print("Nhập điểm Oracle: ");
		this.diemOracle = Integer.parseInt(sc.nextLine());
		System.out.print("Nhập điểm Project: ");
		this.diemProject = Integer.parseInt(sc.nextLine());
		BaiTap4 hv = new BaiTap4(this.MaHV, this.TenHV, this.Lop, this.diemJava, this.diemOracle, this.diemProject);
		return hv;
	}

	public String toString() { // Phương thức hiển thị thông tin học viên
		return "\nMã học viên: " + MaHV + "\nTên học viên: " + TenHV + "\nLớp: " + Lop + "\nĐiểm Java: " + diemJava
				+ "\nĐiểm Oracle: " + diemOracle + "\nĐiểm Project: " + diemProject;
	}

	public float tinhDTB() {// Phương thức tính điểm trung bình, làm tròn đến 2 chữ số thập phân
		float dTB = (float) (diemJava + diemOracle + diemProject) / 3;
		float diemTB = (float) Math.round(dTB * 100) / 100;
		return diemTB;
	}

	public float maxDTB(float a, float b, float c) {// Phương thức tính điểm trung bình lớn nhất
		float max;
		max = a > b ? (a > c ? a : c) : (b > c ? b : c);
		return max;
	}

	public static void line() {
		System.out.println("--------------------------------------------");
	}

	public static void main(String[] args) {
		BaiTap4 hv = new BaiTap4();
		System.out.println("Nhập thông tin học viên 1: ");
		BaiTap4 hv1 = hv.inputData();
		line();
		System.out.println("Nhập thông tin học viên 2: ");
		BaiTap4 hv2 = hv.inputData();
		line();
		System.out.println("Nhập thông tin học viên 3: ");
		BaiTap4 hv3 = hv.inputData();
		line();
		System.out.println("Thông tin học viên 1: " + hv1.toString());
		line();
		System.out.println("Thông tin học viên 2: " + hv2.toString());
		line();
		System.out.println("Thông tin học viên 3: " + hv3.toString());
		line();
		System.out.println("Điểm trung bình của học viên 1 là: " + hv1.tinhDTB());
		System.out.println("Điểm trung bình của học viên 2 là: " + hv2.tinhDTB());
		System.out.println("Điểm trung bình của học viên 3 là: " + hv3.tinhDTB());
		line();
		System.out.println("Điểm trung bình lớn nhất là: " + hv.maxDTB(hv1.tinhDTB(), hv2.tinhDTB(), hv3.tinhDTB()));
	}

}