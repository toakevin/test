public class Weapon{
    private String name;
    private int low_attack;
    private int high_attack;
    
    public Weapon(String name, int low_attack, int high_attack){
        this.name = name;
        this.low_attack = low_attack;
        this.high_attack = high_attack;
    }
    public int getDamage(){
        int range  = (high_attack - low_attack) + 1;
        int damage = (int)(Math.random()*range) + low_attack; 
        return damage;
    }
    public String getName(){
        return name;
    }
}
