package Equipement;

public class Helm implements IArmor{
	
	private String name;
	private int armorValue;
	

	
	public Helm(String name, int armor) {
		this.name = name;
		this.armorValue = armor;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setArmor(int armor) {
		this.armorValue = armor;
	}


	@Override
	public IArmor getArmor() {

		return this;
	}

}
