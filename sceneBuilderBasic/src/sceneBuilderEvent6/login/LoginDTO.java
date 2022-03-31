package sceneBuilderEvent6.login;

public class LoginDTO {
	
	/*
	SQL> CREATE TABLE fx_concept(
	  2  name varchar2(15),
	  3  id varchar2(15),
	  4  pw varchar2(15),
	  5  gender varchar2(6),
	  6  age varchar2(10),
	  7  hobbys varchar2(35),
	  8  primary key(id)
	  9  );

	Table created.

	SQL> INSERT INTO fx_concept VALUES('관리자', 'admin', '1234', '남', '30대', '스포츠 영화');

	SQL> commit;
	Commit complete.
	 */
	private String name;
	private String id;
	private String pw;
	private String gender;
	private String age;
	private String hobbys;
	
	public LoginDTO() {}
	
	public LoginDTO(String name, String id, String pw, String gender, String age, String hobbys) {
		super();
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.gender = gender;
		this.age = age;
		this.hobbys = hobbys;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getHobbys() {
		return hobbys;
	}
	public void setHobbys(String hobbys) {
		this.hobbys = hobbys;
	}
	

}
