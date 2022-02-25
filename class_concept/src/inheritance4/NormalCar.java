package inheritance4;

public class NormalCar extends Car{

	public NormalCar() {
		this(100); //NormalCar(100)
	}
	public NormalCar(int maxSpeed) {
		super(maxSpeed);
	}

}
