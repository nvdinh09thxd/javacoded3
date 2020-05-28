package pk1;

public class FacebookAccount {
	// properties: thuộc tính
	// phạm vi truy cập: public, private, protected

	private int id;
	private String name;
	private String avatar;

	// constructor: phương thức khởi tạo có tham số
	public FacebookAccount(int id, String name, String avatar) {
		super();
		this.id = id;
		this.name = name;
		this.avatar = avatar;
	}

	// phương thức khởi tạo không có tham số
	public FacebookAccount() {
		super();
	}

	// phương thức post status
	public String postStatus(String msg) {
		return msg;
	}

	// phương thức like
	public String like() {
		return "Đã like";
	}

	// phương thức getter (lấy dữ liệu) - setter (gán dữ liệu)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String toString() {
		return "ID: " + this.id + "\nName: " + this.name + "\nAvatar: " + this.avatar;
	}

}
