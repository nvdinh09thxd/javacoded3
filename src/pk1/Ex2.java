package pk1;

public class Ex2 {

	public static void main(String[] args) {
		// khởi tạo 1 đối tượng sinh viên
		SinhVien objSV = new SinhVien(10, "Diễm", "D10");

		// hỏi: SV tên gì
		System.out.println("SV tên là: " + objSV.getHoTen());

		// hỏi: TKB của SV
		String tkb = objSV.xemTKB();
		System.out.println("TKB: " + tkb);

		// hỏi: điểm
		System.out.println("Điểm: " + objSV.xemDiem());

		// hỏi: in ra thông tin sinh viên
		System.out.println("Thông tin sinh viên\n" + objSV.toString());

		// Tạo đối tượng SV Nhanh
		SinhVien objNhanh = new SinhVien(11, "Nhanh", "N11");
		System.out.println("\n=============\n");
		System.out.println(objNhanh.toString());

		// so sánh điểm của 2 sv
		System.out.println("\n=============\n");
		float diemD = objSV.xemDiem();
		float diemN = objNhanh.xemDiem();
		System.out.println("Điểm Diễm: " + diemD);
		System.out.println("Điểm Nhanh: " + diemN);
		if (diemD > diemN) {
			System.out.println("Điểm Diễm > Điểm Nhanh");
		} else if (diemD < diemN) {
			System.out.println("Điểm Diễm < Điểm Nhanh");
		} else {
			System.out.println("Điểm Diễm = Điểm Nhanh");
		}

	}

}
