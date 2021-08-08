package tandoan;

import java.util.Scanner;

public class HocVien2 {
	private int MaHV;
	private String TenHv;
	private String Lop;
	private float DiemJava;
	private float DiemOracle;
	private float DiemProject;
	public int getMaHV() {
		return MaHV;
	}
	public void setMaHV(int maHV) {
		MaHV = maHV;
	}
	public String getTenHv() {
		return TenHv;
	}
	public void setTenHv(String tenHv) {
		TenHv = tenHv;
	}
	public String getLop() {
		return Lop;
	}
	public void setLop(String lop) {
		Lop = lop;
	}
	public float getDiemJava() {
		return DiemJava;
	}
	public void setDiemJava(float diemJava) {
		DiemJava = diemJava;
	}
	public float getDiemOracle() {
		return DiemOracle;
	}
	public void setDiemOracle(float diemOracle) {
		DiemOracle = diemOracle;
	}
	public float getDiemProject() {
		return DiemProject;
	}
	public void setDiemProject(float diemProject) {
		DiemProject = diemProject;
	}
	public HocVien2() {
		super();
	}
	public HocVien2(int maHV, String tenHv, String lop, float diemJava, float diemOracle, float diemProject) {
		super();
		this.MaHV = maHV;
		this.TenHv = tenHv;
		this.Lop = lop;
		this.DiemJava = diemJava;
		this.DiemOracle = diemOracle;
		this.DiemProject = diemProject;
	}
	
	public float tinhDiemTrungBinh(float DiemJava, float DiemOracle, float DiemProject){ 
		float DTB;
		return DTB=(DiemJava+DiemOracle+DiemProject)/3;
	}
	public float timDiemTrungBinhCaoNhat(float hv1, float hv2, float hv3){  
		float max = hv1;
		if(max < hv2){
			max = hv2;
		}
		if( max < hv3){
			max = hv3;
		}
		return max;
	}
	public String toString(){
		return "Mã Học Viên:"+ this.MaHV +"Học viên tên: "+ this.TenHv +"- Lớp :"+ this.Lop + "Điểm Java:" + this.DiemJava+ "Điểm Oracle: "+this.DiemOracle+ "Điểm Project: "+ this.DiemProject;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		HocVien2 hv= new HocVien2();
		HocVien2 hv1=new HocVien2();
		System.out.println("===Nhập thông tin hv 1 :");
		System.out.println("Nhập mã hv : ");
		int MaHV1= Integer.parseInt(sc.nextLine());
		System.out.println("Nhập tên  hv : ");
		String TenHv1= sc.nextLine();
		System.out.println("Nhập lớp : ");
		String Lop1= sc.nextLine();
		System.out.println("Nhập điểm java: ");
		float DiemJava1= Float.parseFloat(sc.nextLine());
		System.out.println("Nhập điểm  Oracle: ");
		float DiemOracle1= Float.parseFloat(sc.nextLine());
		System.out.println("Nhập điểm  Project: ");
		float DiemProject1= Float.parseFloat(sc.nextLine());
		
		//SET thông tin vào hv1
		hv1.setMaHV(MaHV1);
		hv1.setLop(Lop1);
		hv1.setTenHv(TenHv1);
		hv1.setDiemJava(DiemJava1);
		hv1.setDiemOracle(DiemOracle1);
		hv1.setDiemProject(DiemProject1);
		
		HocVien2 hv2=new HocVien2();
		
		System.out.println("===Nhập thông tin hv 2 :");
		System.out.println("Nhập mã hv : ");
		int MaHV2= Integer.parseInt(sc.nextLine());
		System.out.println("Nhập tên hv : ");
		String TenHv2= sc.nextLine();
		System.out.println("Nhập lớp : ");
		String Lop2= sc.nextLine();
		System.out.println("Nhập điểm java: ");
		float DiemJava2= Float.parseFloat(sc.nextLine());
		System.out.println("Nhập điểm  Oracle: ");
		float DiemOracle2= Float.parseFloat(sc.nextLine());
		System.out.println("Nhập điểm Project: ");
		float DiemProject2= Float.parseFloat(sc.nextLine());
		
		hv2.setMaHV(MaHV2);
		hv2.setLop(Lop2);
		hv2.setTenHv(TenHv2);
		hv2.setDiemJava(DiemJava2);
		hv2.setDiemOracle(DiemOracle2);
		hv2.setDiemProject(DiemProject2);
		
		HocVien2 hv3=new HocVien2();
		
		System.out.println("===Nhập thông tin hv 3 :");
		System.out.println("Nhập mã hv : ");
		int MaHV3= Integer.parseInt(sc.nextLine());
		System.out.println("Nhập tên hv : ");
		String TenHv3= sc.nextLine();
		System.out.println("Nhập lớp : ");
		String Lop3= sc.nextLine();
		System.out.println("Nhập điểm java: ");
		float DiemJava3= Float.parseFloat(sc.nextLine());
		System.out.println("Nhập điểm  Oracle: ");
		float DiemOracle3= Float.parseFloat(sc.nextLine());
		System.out.println("Nhập điểm Project: ");
		float DiemProject3= Float.parseFloat(sc.nextLine());
		
		hv3.setMaHV(MaHV3);
		hv3.setLop(Lop3);
		hv3.setTenHv(TenHv3);
		hv3.setDiemJava(DiemJava3);
		hv3.setDiemOracle(DiemOracle3);
		hv3.setDiemProject(DiemProject3);
		
	
		float a = hv.tinhDiemTrungBinh(hv1.DiemJava ,hv1.DiemOracle,hv1.DiemProject);
		System.out.println("Diem trung binh 3 mon cua  hoc vien 1 la :" +a);
		float b = hv.tinhDiemTrungBinh(hv2.DiemJava ,hv2.DiemOracle,hv2.DiemProject);
		System.out.println("Diem trung binh 3 mon cua  hoc vien 2 la :" +b);
		float c = hv.tinhDiemTrungBinh(hv3.DiemJava ,hv3.DiemOracle,hv3.DiemProject);
		System.out.println("Diem trung binh 3 mon cua hoc vien 3 la :" +c);

	
		float max = hv1.timDiemTrungBinhCaoNhat(a,b,c);
		System.out.println("Diem trung binh cao nhat trong 3 hv la :" +max);
		

		
	}
}
