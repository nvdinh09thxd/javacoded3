package pk1;

public class FacebookFanpage extends FacebookAccount {
	private String country;

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public FacebookFanpage(int id, String name, String avatar, String country) {
		super(id, name, avatar);//goi thuoc tinh tu lop cha
		this.country = country;
	}

	public FacebookFanpage() {
//		super();
	}

	public String toString() {
		return super.toString() + "\nCountry: " + this.country; // goi phuong thuc tu lop cha
	}

}
