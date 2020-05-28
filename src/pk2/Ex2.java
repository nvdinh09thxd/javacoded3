package pk2;

public class Ex2 {

	public static void main(String[] args) {
		Calculator c1 = new Calculator(8, 5);
		int tong = c1.tong();
		int hieu = c1.hieu();
		int tich = c1.tich();
		float thuong = c1.thuong();
		System.out.println("Tổng 8 + 5 = " + tong);
		System.out.println("Hiệu 8 - 5 = " + hieu);
		System.out.println("Tích 8 * 5 = " + tich);
		System.out.println("Thương 8 / 5 = " + thuong);

	}

}
