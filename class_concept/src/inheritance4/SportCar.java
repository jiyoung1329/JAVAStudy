package inheritance4;

public class SportCar extends Car{
	private boolean buster;
	
	public SportCar(int maxSpeed) {
		super(maxSpeed);
		buster = false;
	}
	public SportCar(int maxSpeed, boolean buster) {
		super(maxSpeed);
		this.buster = buster;
	}
	
	// 부모의 메소드를 상속받음. 그러면서 drive는 자식의 메소드에서 재정의(overriding)
	@Override
	public void drive() {
		if(buster == true) {
			setDistance(getDistance() + getMaxSpeed() * 0.75);
		}else
			super.drive();
	}
}
