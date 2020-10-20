package Entity;

public class Mage implements IClass {
    private int mana = 100;

    @Override
    public String getClassName() {
        return "Mage";
    }

    @Override
    public int getRessourceAmount() {
        return mana;
    }
    
}
