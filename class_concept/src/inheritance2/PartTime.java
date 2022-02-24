package inheritance2;

public class PartTime {
	private String name;
	private int salary;
	private int time, pay; 
	
	public PartTime() {}
	
	
	public PartTime(String name, int time, int pay) {
		super();
		this.name = name;
		this.time = time;
		this.pay = pay;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getTime() {
		return time;
	}


	public void setTime(int time) {
		this.time = time;
	}


	public int getPay() {
		return pay;
	}


	public void setPay(int pay) {
		this.pay = pay;
	}
	
	public int getSalary() {
		return salary;
	}


	public void setSalary() {
		this.salary = time * pay;
	}
}
