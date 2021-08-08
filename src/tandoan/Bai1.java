package tandoan;

import java.util.Scanner;

public class Bai1 {
	public static void dem(int n) {
		int chia3=0;
		int chia5=0;
		for (int i = 0; i <= n; i++) {
			
			if(i%3==0) {
				chia3++;
			}
			if(i%5==0) {
				chia5++;
			}
		}
		System.out.println("co: "+chia3+" so chia het cho 3");
		System.out.println("co: "+chia5+ " so chia het cho 5");
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n;
			do {
				n=0;
				
				System.out.println("Nhap so  n<10||n>100 : ");
				try {
					n= Integer.parseInt(sc.nextLine());
				} catch (NumberFormatException e) {
					System.out.println(" vui long nhap n la so!!!");
				}
			} while ((n<10||n>100));	
			
		dem(n);
		
		
	}
}
