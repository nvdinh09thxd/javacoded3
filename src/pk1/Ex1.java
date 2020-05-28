package pk1;

public class Ex1 {

	public static void main(String[] args) {
		FacebookAccount fb = new FacebookAccount(1, "Định", "dinh.jpg");
		System.out.println(fb.like());
		System.out.println(fb.postStatus("Hôm nay trời mưa rồi!"));
		System.out.println(fb.toString());		
	}

}
