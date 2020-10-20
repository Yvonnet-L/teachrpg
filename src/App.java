import Entity.Mage;
import Entity.Player;
import Equipement.Staff;

public class App {
    public static void main(String[] args) throws Exception {
        Player p1 = new Player("Lufen", 1, new Mage(), new Staff("Baton", 10), new Helm("Capuche", 15));
        
        System.out.println(p1.toString());
        
       
    }
}
