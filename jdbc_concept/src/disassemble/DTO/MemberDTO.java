package disassemble.DTO;

public class MemberDTO implements IMemberDTO{
	
	/*
	 * SQL SEQUNCE 생성 구문
	 *  create sequence member_seq start with 1 increment by 1;
	 * 
	 * SQL TABLE 생성 구문
	 * CREATE TABLE member(
     * num number(20),
     * email varchar2(30),
     * name varchar2(20),
     * password varchar2(20),
     * registerDate varchar2(20)
     * );
	 * 
	 */
	private long num;
	private String email;
	private String password;
	private String name;
	private String registerDate;

	public MemberDTO() {}
	
	public MemberDTO(long num, String email, String password, String name, String registerDate) {
		super();
		this.num = num;
		this.email = email;
		this.password = password;
		this.name = name;
		this.registerDate = registerDate;
	}

	public long getNum() {
		return num;
	}

	public void setNum(long num) {
		this.num = num;
	}

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
