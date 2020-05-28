package pk2;

public class GiangVien {

	private String hoTen;
	private int namSinh;
	private String lopHoc;
	
	public GiangVien(String hoTen, int namSinh, String lopHoc) {
		super();
		this.hoTen = hoTen;
		this.namSinh = namSinh;
		this.lopHoc = lopHoc;
	}
	
	public GiangVien() {
		
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public int getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}

	public String getLopHoc() {
		return lopHoc;
	}

	public void setLopHoc(String lopHoc) {
		this.lopHoc = lopHoc;
	}
	
	public String toString() {
		return "Họ tên: " + this.hoTen + "\nNăm sinh: " + this.namSinh + "\nLớp học: " + this.lopHoc;
	}
}
