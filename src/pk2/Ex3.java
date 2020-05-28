package pk2;

public class Ex3 {

	public static void main(String[] args) {
		HocVien hv1 = new HocVien();
		hv1.nhapThongTin();
		hv1.kiemTraId();
		
		HocVien hv2 = new HocVien();
		hv2.nhapThongTin();
		hv2.kiemTraId();
		
		hv2.soSanhDiemTB(hv1, hv2);
	}
	
}
