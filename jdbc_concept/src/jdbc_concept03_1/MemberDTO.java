package jdbc_concept03_1;
/*
 SQL> CREATE TABLE concept03(
  2  num number,
  3  email varchar2(30),
  4  name varchar2(20),
  5  password varchar2(20)
  6  );

Table created.

SQL> CREATE SEQUENCE concept03_seq INCREMENT BY 1 START WITH 1;

Sequence created.

SQL> commit;

Commit complete.

SQL>
 */
public class MemberDTO {
	private int num;
	private String email;
	private String name;
	private String password;
	private String changePassword;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
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
	
	public String getChangePassword() {
		return changePassword;
	}
	public void setChangePassword(String changePassword) {
		this.changePassword = changePassword;
	}
	
	
}
