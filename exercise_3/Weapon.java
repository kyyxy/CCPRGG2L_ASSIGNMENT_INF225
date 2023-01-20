public class Weapon {
    int damage;
    String rarity;
    String name;
    int additionalDamage;

    public void sayMyName() {
        System.out.println("Weapon : " + name);
    }
    public void sayMyDamage() {
        System.out.println("Damage : " + damage);
    }
    public void Attack(){
        System.out.println("I am attacking");
    }
    public void AddDamage(int additionalDamage){
        int newDamage = this.damage + this.additionalDamage;

        System.out.println("Damage increased from " + damage + "to" + newDamage);

        this.damage = newDamage;
    }
    public String ShowWeaponNameandRarity(){
        return this.name + " " + this.rarity;
    }
}

