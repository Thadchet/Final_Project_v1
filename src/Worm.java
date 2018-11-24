
public class Worm {
	private int score ; // default score = 10
	private int health ; // default health = 1
	private int speed ; // default speed = 100 
	private int damage ; // default damage = 1
	
	
	
	public Worm(int score , int health , int speed , int damage) {
		this.score = score ;
		this.damage = damage ;
		this.speed = speed ;
		this.health = damage ;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
	
	public void takeDamage(int damage) {
		this.health = this.health - damage ;
		if(this.health < 0) this.health = 0 ;
	}
	
	public boolean isDead() {
		return health == 0 ;
	}
	
	 
}
