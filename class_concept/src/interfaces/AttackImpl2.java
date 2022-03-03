package interfaces;

public class AttackImpl2 implements IAttack, IDefense{

	@Override
	public void attack() {
		System.out.println("공격력 200");
	}

	@Override
	public void defense() {
		// TODO Auto-generated method stub
		
	}
	
//	@Override
//	public void defense() {
//		System.out.println("방어력 200");
//	}
}
