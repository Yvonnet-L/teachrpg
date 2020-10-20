package Entity;

public class Mage implements IClass {
   

	private int mana = 100;



    @Override
    public int getRessourceAmount() {
        return mana;
    }
    
    
    @Override
   	public String toString() {
   		return "Mage [mana=" + mana + "]";
   	}
    
}
