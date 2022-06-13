package tw.com.lccnet.web.utils;

public class UserSetComment {
	private int id;
	private String email;
	private String comment;
	private String pic;
	
	public UserSetComment() {}

	public UserSetComment(int id, String email, String comment, String pic) {
		super();
		this.id = id;
		this.email = email;
		this.comment = comment;
		this.pic = pic;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}
	
	
}
