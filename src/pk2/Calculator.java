package pk2;

public class Calculator {
	private int number1;
	private int number2;

	public Calculator(int number1, int number2) {
		super();
		this.number1 = number1;
		this.number2 = number2;
	}

	public Calculator() {

	}

	public int getNumber1() {
		return number1;
	}

	public void setNumber1(int number1) {
		this.number1 = number1;
	}

	public int getNumber2() {
		return number2;
	}

	public void setNumber2(int number2) {
		this.number2 = number2;
	}

	public int tong() {
		int tong = this.number1 + this.number2;
		return tong;
	}

	public int hieu() {
		int hieu = this.number1 - this.number2;
		return hieu;
	}

	public int tich() {
		int tich = this.number1 * this.number2;
		return tich;
	}

	public float thuong() {
		if (number2 == 0) {
			return 0;
		} else {
			float thuong = (float) this.number1 / (float) this.number2;
			return thuong;
		}
	}
}
