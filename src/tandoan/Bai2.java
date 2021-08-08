package tandoan;

import java.util.Random;
import java.util.Scanner;

public class Bai2 {
	public int ranDom() {
		Random rdRandom = new Random();
		int soNgauNhien = rdRandom.nextInt(11) + 8;
		System.out.println("so ngau nhien: "+soNgauNhien);
		return soNgauNhien;

	}

	public int nhapSoTuBanPhim() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so tu ban phim: ");
		int n = sc.nextInt();
		return n;
	}

	public static  void sosanh(int a, int b) {
		if (a>b) {
			System.out.println("số từ bàn phím lớn hơn số ngẫu nhiên");
		}else if(a<b){
			System.out.println("số từ bàn phím nhỏ hơn số ngẫu nhiên");
		}else {
			System.out.println("số từ bàn phím bằng số ngẫu nhiên");
		}	
	}

	public static void main(String[] args) {
		Bai2 numExercise2 = new Bai2();
		int a=numExercise2.nhapSoTuBanPhim();
		int b=numExercise2.ranDom();
		sosanh(a, b);
	}
}
