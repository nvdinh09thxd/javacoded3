package pk2;

public class Ex1 {

	public static void main(String[] args) {
		GiangVien gv1 = new GiangVien("Tran Thi A", 1987, "java38");
		System.out.println(gv1.toString());
		
		System.out.println("\n==========\n");
		
		GiangVien gv2 = new GiangVien("Tran Văn B", 1989, "java38");
		System.out.println(gv2.toString());
	}

}
