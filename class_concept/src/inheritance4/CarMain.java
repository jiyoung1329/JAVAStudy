package inheritance4;

public class CarMain {

	public static void main(String[] args) {
		NormalCar nc1 = new NormalCar();
		NormalCar nc2 = new NormalCar(200);
		
		nc1.drive();
		nc2.drive();
		
		System.out.println("nc1 : " + nc1.getDistance());
		System.out.println("nc2 : " + nc2.getDistance());

		SportCar sc1 = new SportCar(200);
		SportCar sc2 = new SportCar(200, true);
		
		sc1.drive();
		sc2.drive();
		
		System.out.println("sc1 : " + sc1.getDistance());
		System.out.println("sc2 : " + sc2.getDistance());
	}

}
