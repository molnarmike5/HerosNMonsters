public class Weapon {
    private String weaponName;
    private int atkBonus;
    private int speedBonus;
    //private Enchantment enchantment;

    public Weapon(String weaponName, int atkBonus, int speedBonus /*Enchantment enchantment*/){
        this.weaponName = weaponName;
        this.atkBonus = atkBonus;
        this.speedBonus = speedBonus;
        //this.Enchantment = enchantment;
    }

    //---------------------------------------------------------getter----------------------------------------------------------

    public String getWeaponName(String weaponName){return weaponName;}

    public int getAtkBonus(int atkBonus){return atkBonus;}
    public int getSpeadBonus(int speadBonus){return speadBonus;}

    /*public Enchantment getEnchantment() {
        return enchantment;
    }*/
    //---------------------------------------------------------setter-----------------------------------------------------------

    public void setWeaponName(String weaponName){this.weaponName = weaponName;}

    public void setAtkBonus(int atkBonus){this.atkBonus = atkBonus;}
    public void setSpeadBonus(int speedBonus){this.speedBonus = speedBonus;}

    /*public void setEnchantment(Enchantment enchantment) {
        this.enchantment = enchantment;
    }*/

}
