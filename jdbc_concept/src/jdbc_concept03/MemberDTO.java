package jdbc_concept03;

public class MemberDTO {
	private int num;
	private String email;
	private String name;
	private String password;
	
	public MemberDTO() {}
	
	public MemberDTO(int num, String email, String name, String password) {
		super();
		this.num = num;
		this.email = email;
		this.name = name;
		this.password = password;
	}

	public int getNum() {
		return num;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

}
