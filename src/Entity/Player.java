package Entity;

import java.util.Objects;

public class Player {
    private String  name;
    private int     level;
    private IClass  currentClass;

    public Player(String name, int level, IClass myclass) {
        this.name = name;
        this.level = level;
        currentClass = myclass;
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
        return "{" +
            " name='" + getName() + "'" +
            ", level='" + getLevel() + "'" +
            "}";
    }


    public IClass getCurrentClass() {
        return this.currentClass;
    }

    public void setCurrentClass(IClass currentClass) {
        this.currentClass = currentClass;
    }

    
}
