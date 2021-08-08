package test;

public class Max3So {

	public static void main(String[] args) {
		float a = 3;
		float b = 4;
		float c = 5;
		float max;
		max = a > b ? (a > c ? a : c) : (b > c ? b : c);
		System.out.println(max);
	}

}
