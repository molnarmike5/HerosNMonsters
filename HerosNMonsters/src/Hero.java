public class Hero extends Identity {
    private int xp;
    private int curentXp;
    private int gold;
    private Weapon weapon;
    //private Passive passive;

    public Hero(String name, int lvl, int hp, int fp, int ap, int speed, Weapon weapon /*Passive passive*/) {
        super(name, lvl, hp, fp, ap, speed);
        this.xp = nextLvl();
        this.gold = addGold();
        this.weapon = weapon;
        //this.passive = passive;
    }

    //---------------------------------------------------------getter----------------------------------------------------------

    public int getXp() {
        return xp;
    }

    public int getCurentXp() {
        return curentXp;
    }

    public int getGold() {
        return gold;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    /*public Passive getPassive() {
        return passive;
    }*/


    //---------------------------------------------------------setter----------------------------------------------------------------------

    public void setXp(int xp) {
        this.xp = xp;
    }

    public void setCurentXp(int curentXp) {
        this.curentXp = curentXp;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    /*public void setPassive(passive passive) {
        this.passive = passive;
    }*/

    //---------------------------------------------------------voids-----------------------------------------------------

    public int addGold() {
        double goldcalculation = 10 * (this.getLvl() * (Math.random() * 0.5));
        return (int) (Math.floor(goldcalculation / 10.0) * 10);

    }

    public int nextLvl() {
        double neededXp = 10 * (this.getLvl() * 1.2);
        return (int) (Math.floor(neededXp / 10.0) * 10);
    }

    public void lvlUp() {
        if (curentXp >= xp) {
            curentXp = 0;
            this.setLvl(this.getLvl() + 1);
            this.setCurentHp(this.getMaxHp());
            this.setCurentFp(this.getFp());
            gold += addGold();
        }
    }
}
