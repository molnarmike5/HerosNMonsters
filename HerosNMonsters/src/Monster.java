import java.util.ArrayList;
import java.util.List;

public class Monster {
    private Weapon monsterWeapon;
    private MonsterPrefix monsterPrefix;
    private int monsterXpDrop;
    private int monsterGoldDrop;
    //List<Item> MonsterLoot = new ArrayList<Item>();

    public Monster(Weapon monsterWeapon, MonsterPrefix monsterPrefix, int monsterXpDrop, int monsterGoldDrop){
        this.monsterWeapon = monsterWeapon;
        this.monsterPrefix = monsterPrefix;
        this.monsterXpDrop = monsterXpDrop;
        this.monsterGoldDrop = monsterGoldDrop;
    }
}
