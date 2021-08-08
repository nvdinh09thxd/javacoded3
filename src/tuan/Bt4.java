package tuan;

import java.util.Scanner;

public class Bt4 {
	private String maHV;
	private String tenHV;
	private String Lop;
	private float diemJAVA;
	private float diemOracle;
	private float diemProject;

	public String getMaHV() {
		return maHV;
	}

	public void setMaHV(String maHV) {
		this.maHV = maHV;
	}

	public String getTenHV() {
		return tenHV;
	}

	public void setTenHV(String tenHV) {
		this.tenHV = tenHV;
	}

	public String getLop() {
		return Lop;
	}

	public void setLop(String lop) {
		Lop = lop;
	}

	public float getDiemJAVA() {
		return diemJAVA;
	}

	public void setDiemJAVA(float diemJAVA) {
		this.diemJAVA = diemJAVA;
	}

	public float getDiemOracle() {
		return diemOracle;
	}

	public void setDiemOracle(float diemOracle) {
		this.diemOracle = diemOracle;
	}

	public float getDiemProject() {
		return diemProject;
	}

	public void setDiemProject(float diemProject) {
		this.diemProject = diemProject;
	}

	public Bt4() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bt4(String maHV, String tenHV, String lop, float diemJAVA, float diemOracle, float diemProject) {
		super();
		this.maHV = maHV;
		this.tenHV = tenHV;
		Lop = lop;
		this.diemJAVA = diemJAVA;
		this.diemOracle = diemOracle;
		this.diemProject = diemProject;
	}

	public Bt4 nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập mã học viện: ");
		this.maHV = sc.nextLine();
		System.out.println("Nhập tên học viên: ");
		this.tenHV = sc.nextLine();
		System.out.println("Nhập Lớp: ");
		Lop = sc.nextLine();
		System.out.println("Nhập điểm JAVA: ");
		this.diemJAVA = Float.parseFloat(sc.nextLine());
		System.out.println("Nhập điểm Oracle: ");
		this.diemOracle = Float.parseFloat(sc.nextLine());
		System.out.println("Nhập điểm Project: ");
		this.diemProject = Float.parseFloat(sc.nextLine());
		Bt4 hocVien = new Bt4(this.maHV, this.tenHV, Lop, this.diemJAVA, this.diemOracle, this.diemProject);
		return hocVien;
	}

	@Override
	public String toString() {
		return "Mã Học Viên: " + maHV + "\n" + "Tên Học Viên: " + tenHV + "\n" + "Lớp:" + Lop + "\n" + "Điểm Java: "
				+ diemJAVA + "\n" + "Điểm Oracle: " + diemOracle + "\n" + "Điểm Project: " + diemProject + "\n" + "\n";
	}

	public float diemTBinh() {

		float diemTrungB = (float) (diemJAVA + diemOracle + diemProject) / 3;
		return diemTrungB;
	}

	public void maxDTB(float DTBhv1, float DTBhv2) {
			if (DTBhv1 > DTBhv2) {
				System.out.println("Điểm học viên 1 cao nhất :" + DTBhv1);
			} else {
				System.out.println("Điểm học viên 2 cao nhất :" + DTBhv2);
			}
	}

	public static void main(String[] args) {
		Bt4 hocVien = new Bt4();
		System.out.println("Nhập thông tin Học Viên thứ 1: ");
		Bt4 hocVien1 = hocVien.nhap();
		System.out.println("Nhập thông tin Học Viên thứ 2: ");
		Bt4 hocVien2 = hocVien.nhap();
		System.out.println("\n Thông tin Học Viên 1: " + hocVien1.toString());
		System.out.println("\n Thông tin Học Viên 2: " + hocVien2.toString());
		System.out.println("Điểm trung bình của Học Viên 1: " + hocVien1.diemTBinh());
		System.out.println("Điểm trung bình của Học Viên 2: " + hocVien2.diemTBinh());
		
		
		hocVien.maxDTB(hocVien1.diemTBinh(), hocVien2.diemTBinh());
	}
}
