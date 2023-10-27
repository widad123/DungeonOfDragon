import java.util.ArrayList;
import java.util.List;

public class Room {
    private Monster monster; // Monstre présent dans la pièce
    private List<Potion> items; // Liste des objets (potions) dans la pièce

    public Room() {
        this.items = new ArrayList<>();
    }

    public Monster getMonster() {
        return monster;
    }

    public void setMonster(Monster monster) {
        this.monster = monster;
    }

    public List<Potion> getItems() {
        return items;
    }

    public void addItem(Potion item) {
        items.add(item);
    }

    public boolean hasItems() {
        return !items.isEmpty();
    }

    public Potion search() {
        if (hasItems()) {
            return items.remove(0); // Retire et retourne la première potion de la liste
        }
        return null; // Aucune potion trouvée
    }
}
