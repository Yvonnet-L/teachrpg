package Entity;

import java.util.Objects;

import Equipement.IArmor;
import Equipement.IWeapon;

public class Player {
    private String  name;
    private int     level;
    private IClass  currentClass;
    private IWeapon currentWeapon;
    private IArmor currentHelmet;
    
    

    public Player(String name, int level, IClass myclass, IWeapon myweapon, IArmor myHelmet) {
        this.name = name;
        this.level = level;
        currentClass = myclass;
        currentWeapon = myweapon;
        setCurrentHelmet(myHelmet);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return this.level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Player)) {
            return false;
        }
        Player player = (Player) o;
        return Objects.equals(name, player.name) && level == player.level;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, level);
    }

  


  

	@Override
	public String toString() {
		return "Player [name=" + name + ", level=" + level + ", currentClass=" + currentClass + ", currentWeapon="
				+ currentWeapon + "]";
	}

	public IClass getCurrentClass() {
        return this.currentClass;
    }

    public void setCurrentClass(IClass currentClass) {
        this.currentClass = currentClass;
    }

	public IWeapon getCurrentWeapon() {
		return currentWeapon;
	}

	public void setCurrentWeapon(IWeapon currentWeapon) {
		this.currentWeapon = currentWeapon;
	}

	public IArmor getCurrentHelmet() {
		return currentHelmet;
	}

	public void setCurrentHelmet(IArmor currentHelmet) {
		this.currentHelmet = currentHelmet;
	}



    
}
