public class Monster {
    private Weapon monsterWeapon;
    private int monsterXpDrop;
    private int monsterGoldDrop;
    //List<Item> MonsterLoot = new ArrayList<Item>();

    public Monster(Weapon monsterWeapon, int monsterXpDrop, int monsterGoldDrop){
        this.monsterWeapon = monsterWeapon;
        this.monsterXpDrop = monsterXpDrop;
        this.monsterGoldDrop = monsterGoldDrop;
    }
}
