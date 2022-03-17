package disassemble.DTO;

public class RegisterRequest implements IRegisterRequest{
	
	private String email;
	private String name;
	private String password;
	private String confirmPassword;
	
	public RegisterRequest() {}
	
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
