
public class HealWorm extends Worm{

	public HealWorm() {
		super(20,1,1); //score,health,damage
	}
	
	public void heal(Hammer hammer) {
		hammer.setHealth(hammer.getHealth()+3);
	}
}
