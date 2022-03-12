package objects;

class Car{
	private int speed;
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getSpeed() {
		return speed;
	}
	@Override
	public String toString() {
		return "속도는 " + getSpeed() + "km 입니다.";
	}
}
public class Ex2 {

	public static void main(String[] args) {
		Car car = new Car();
		car.setSpeed(200);
		System.out.println(car.toString());
		
		car.setSpeed(300);
		System.out.println(car.toString());
	}

}
