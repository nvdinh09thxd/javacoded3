package pk1;

import java.util.Random;

public class SinhVien {

	private int id;
	private String hoTen;
	private String maSV;
	
	public SinhVien() {
		super();
	}

	public SinhVien(int id, String hoTen, String maSV) {
		super();
		this.id = id;
		this.hoTen = hoTen;
		this.maSV = maSV;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getMaSV() {
		return maSV;
	}

	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}
	
	public float xemDiem() {
		Random rd = new Random();
		int number = rd.nextInt(11);
		return number;
	}
	
	public String xemTKB() {
		return "Hôm nay học JAVACORE";
	}
	
	public String toString() {
		return "Id: " + this.id + "\nHọ tên: " + this.hoTen + "\nMã SV: " + this.maSV;
	}
}
