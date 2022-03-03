package training02;

public class MemberDTO {
	private String email, name, mobile;

	public MemberDTO(String email, String name, String mobile) {
		super();
		this.email = email;
		this.name = name;
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
}
