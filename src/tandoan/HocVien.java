package tandoan;

import java.util.Scanner;

public class HocVien {
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
	public HocVien() {
		super();
	}
//	public Exercise4(int maHV, String tenHv, String lop, float diemJava, float diemOracle, float diemProject) {
//		super();
//		this.MaHV = maHV;
//		this.TenHv = tenHv;
//		this.Lop = lop;
//		this.DiemJava = diemJava;
//		this.DiemOracle = diemOracle;
//		this.DiemProject = diemProject;
//	}
	
	public static void tinhDiemTrungBinh(HocVien[] ex){ 
		float DTB = 0.0f;
		for (int i = 0; i < ex.length; i++) {
			DTB=(ex[i].DiemJava+ex[i].DiemOracle+ex[i].DiemProject)/3;
			System.out.println("Điểm trung bình của học viên "+(i+1)+" là: "+DTB);
		}
		
		
	}
	public static void timDiemTrungBinhCaoNhat(HocVien[] ex){  
		float max = (ex[0].DiemJava+ex[0].DiemOracle+ex[0].DiemProject)/3 ;
		for (int i = 0; i < ex.length; i++) {
			if(max<((ex[i].DiemJava+ex[i].DiemOracle+ex[i].DiemProject)/3)) {
				max=(ex[i].DiemJava+ex[i].DiemOracle+ex[i].DiemProject)/3;
				
			}
		}
	
		System.out.println("Điểm trung bình cao nhất của "+ex.length+" học viên là: "+max);
	}
	public void input() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Nhập mã hv : ");
		 MaHV= Integer.parseInt(sc.nextLine());
		System.out.println("Nhập tên  hv : ");
		 TenHv= sc.nextLine();
		System.out.println("Nhập lớp : ");
		 Lop= sc.nextLine();
		System.out.println("Nhập điểm java: ");
		 DiemJava= Float.parseFloat(sc.nextLine());
		System.out.println("Nhập điểm  Oracle: ");
		 DiemOracle= Float.parseFloat(sc.nextLine());
		System.out.println("Nhập điểm  Project: ");
		 DiemProject= Float.parseFloat(sc.nextLine());
	}
	public String toString(){
		return "Mã Học Viên:"+ this.MaHV +"--Học viên tên: "+ this.TenHv +"-- Lớp :"+ this.Lop + "--Điểm Java:" + this.DiemJava+ "--Điểm Oracle: "+this.DiemOracle+ "--Điểm Project: "+ this.DiemProject;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		boolean check;
		int n=0;
		do {
			check=false;
			System.out.println("===Nhập số lượng HV :");
			try {
						n =  Integer.parseInt(sc.nextLine());
						if (n < 0) {
							throw new GeneralException("Lỗi vui lòng nhập số lượng học viên >0!!!");
						}
			} catch (NumberFormatException e) {
				System.out.println("Vui lòng nhập số lượng là số !!!");
				check=true;
			}catch (GeneralException e) {
				System.out.println(e.getMessage());
				check=true;
			}
		} while (check);
		HocVien[] student = new HocVien[n];
		for (int i = 0; i < student.length; i++) {
			System.out.println("Nhập thông tin học viên thứ "+(i+1));
			student[i] = new HocVien();
			student[i].input();
			
		}
		
		for (HocVien exercise4 : student) {
			System.out.println(exercise4.toString());
		}
		tinhDiemTrungBinh(student);
		
		timDiemTrungBinhCaoNhat(student);
		
	}
}
