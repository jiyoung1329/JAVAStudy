package disassemble.DTO;

public class MemberDTO implements IMemberDTO{
	private String email; // 이메일
	private String password; // 비밀번호
	private String name; // 이름
	private String registerDate; // 가입일
	
	// Constructor
	public MemberDTO() {}
	
	public MemberDTO(String email, String password, String name, String registerDate) {
		super();
		this.email = email;
		this.password = password;
		this.name = name;
		this.registerDate = registerDate;
	}
	
	// Getter & Setter Method
	@Override
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public void setRegisterDate(String registerDate) {
		this.registerDate = registerDate;
	}
	@Override
	public String getEmail() {
		return email;
	}
	@Override
	public String getPassword() {
		return password;
	}
	@Override
	public String getName() {
		return name;
	}
	@Override
	public String getRegisterDate() {
		return registerDate;
	}
	
}
