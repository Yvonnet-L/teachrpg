package Equipement;

public class Staff implements IWeapon{
	private String name;
	private int damage;
	
	
	

	public Staff(String name, int damage) {
		this.name = name;
		this.damage = damage;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public Staff(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public IWeapon getWeapon() {
		return this;
	}
 
	@Override
	public String toString() {
		return "Staff [name=" + name + ", damage=" + damage + ", getClass()=" + getClass() + "]";
	}

	

}
