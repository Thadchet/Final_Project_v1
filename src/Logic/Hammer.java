package Logic;
public class Hammer implements Hitable {
	private int damage;
	private SumScore sumscore;
	private boolean reload;
	private int health;
	final int maxhp = 10;

	public Hammer() {
		this.damage = 1;
		this.reload = false;
		this.health = 10;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public SumScore getSumscore() {
		return sumscore;
	}

	public void setSumscore(SumScore sumscore) {
		this.sumscore = sumscore;
	}

	public boolean isReload() {
		return reload;
	}

	public void setReload(boolean reload) {
		this.reload = reload;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		if (health < 0) {
			health = 0;
		}
		if (health > maxhp) {
			health = maxhp;
		}
		this.health = health;
	}

	public void hit(Object o) {
		if (o instanceof Rock) {
			sumscore.addSocre(((Rock) o).getScore());
		}
		if (o instanceof Worm) {
			sumscore.addSocre(((Worm) o).getScore());
		}
		this.reload = true;
	}

	public boolean isDead() {
		return (health == 0);
	}

	public void reloading() {
		this.reload = false;
	}

	public void takeDamage(Worm w) {
		this.setHealth(health - w.getDamage());
	}

}
