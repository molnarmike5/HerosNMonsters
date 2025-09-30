public class Identity {
    private String name;
    private int lvl;
    private int hp;
    private int currentHp;
    private int maxHp;
    private int fp;
    private int currentFp;
    private int ap;
    private int speed;

    public Identity(String name, int lvl, int hp, int fp, int ap, int speed) {
        this.name = name;
        this.lvl = lvl;
        this.hp = hp; //---------> bin mir nicht sicher.
        this.currentHp = hp;
        this.maxHp = maxHpCalk();
        this.fp = fp;
        this.currentHp = fp;
        this.ap = ap;
        this.speed = speed;
    }

    //---------------------------------------------------------getter----------------------------------------------------------

    public String getName() {
        return name;
    }

    public int getLvl() {
        return lvl;
    }

    public int getHp() {
        return hp;
    }

    public int getCurentHp() {
        return currentHp;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public int getFp() {
        return fp;
    }

    public int getCurrentFp() {
        return currentFp;
    }

    public int getAp() {
        return ap;
    }

    public int getSpeed() {
        return speed;
    }

    //---------------------------------------------------------setter----------------------------------------------------------------------

    public void setName(String name) {
        this.name = name;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setCurentHp(int curentHp) {
        this.currentHp = curentHp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    public void setFp(int fp) {
        this.fp = fp;
    }

    public void setCurrentFp(int currentFp) {
        this.currentFp = currentFp;
    }

    public void setAp(int ap) {
        this.ap = ap;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    //---------------------------------------------------------voids-----------------------------------------------------


    @Override
    public String toString() {
        return "Identity{" +
                "name='" + name + '\'' +
                ", lvl=" + lvl +
                ", hp=" + hp +
                ", curentHp=" + currentHp +
                ", maxHp=" + maxHp +
                ", fp=" + fp +
                ", curentFp=" + currentFp +
                ", ap=" + ap +
                ", speed=" + speed +
                '}';
    }

    /*public int lvlMod(int val) {
        double tVal = val * Math.pow(1.1, lvl);
        return (int) (Math.floor(tVal / 10.0) * 10);
    }*/

    public int maxHpCalk() {
        double fMaxHp = hp + (hp * 0.5);
        return (int) (Math.floor(fMaxHp / 10.0) * 10);
    }

    public void looseOverHeal(){
        if(currentHp <= maxHp && currentHp > hp){
            currentHp -= (int) (Math.ceil( hp / 100));
            if (currentHp <= hp){
                currentHp = hp;
            }
        }
    }

    public void ui() {
        System.out.println("Name: " + name + " Level: " + lvl + " Health: " + hp);
    }

    public void death() {
        if (currentHp >= 0) {
            currentHp = 0;
            System.out.println(name + " just died!");
        }
    }

    public void maxFp() {
        if (currentFp >= fp) {
            currentFp = fp;
        }
    }

    public void minFp() {
        if (currentFp <= 0) {
            currentFp = 0;
            System.out.println(name + " is out of FP!");
        }
    }

    void skill1() {
    }

    void skill2() {
    }

    void skill3() {
    }

}
