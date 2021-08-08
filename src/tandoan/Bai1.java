package tandoan;

import java.util.Scanner;

public class Bai1 {
	private static int n;
	
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public static void dem(int n) {
		int chia3=0;
		int chia5=0;
		for (int i = 0; i < n; i++) {
			if(n%5==0) {
				chia5++;
			}
			if(n%3==0) {
				chia3++;
			}
		}
		System.out.println("co: "+chia3+" so chia het cho 3");
		System.out.println("co: "+chia5+ " so chia het cho 5");
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		boolean check;
		do {
			System.out.println("Nhap so n : ");
			check=false;
			try {
				n= Integer.parseInt(sc.nextLine());
			} catch (Exception e) {
				System.out.println("Please n is number");
				check=true;
			}
				
			
		} while ((n<10||n>100)&&check);
		dem(n);
		
		
	}
}
