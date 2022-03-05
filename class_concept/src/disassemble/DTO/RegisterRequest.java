package disassemble.DTO;

public class RegisterRequest implements IRegisterRequest{
	private String email; // 이메일
	private String password; // 비밀번호
	private String name; // 이름
	private String confirmPassword; // 비밀번호 확인
	
	// Constructor
	public RegisterRequest(){}
	
	public RegisterRequest(String email, String name, String password, String confirmPassword) {
		super();
		this.email = email;
		this.name = name;
		this.password = password;
		this.confirmPassword = confirmPassword;
	}

	// Getter & Setter Method
	@Override
	public String getEmail() {
		return email;
	}
	@Override
	public String getName() {
		return name;
	}
	@Override
	public String getPassword() {
		return password;
	}
	@Override
	public String getConfirmPassword() {
		return confirmPassword;
	}
	@Override
	public void setPassword(String password) {
		this.password = password;
		
	}
	@Override
	public void setEmail(String email) {
		this.email = email;
		
	}
	@Override
	public void setName(String name) {
		this.name = name;
		
	}
	@Override
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
		
	}
	
	
}
