public class App {
    public static void main(String[] args) {

        Weapon Sword = new Weapon();

        Sword.name = "Gryphon";
        Sword.damage = 6;
        Sword.rarity = "Rare";
        Sword.sayMyName();
        Sword.sayMyDamage();
        Sword.AddDamage(additionalDamage:9);
        System.out.println(Sword.ShowWeaponNameandRarity());
        
        

        Character Warrior = new Character();

        Warrior.name = "Alfredo";
        Warrior.sayMyName();
        Warrior.Attack();
    
       
    }
}
