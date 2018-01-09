public class Monster{
    private String name;
    private int health;
    private int low_attack;
    private int high_attack;
    private int xpos;
    private int ypos;   
    private int speed;
    public Monster(){
        name = null;
        xpos = 0;
        ypos = 0;
        health = 0;
        low_attack = 0;
        high_attack = 0;
        speed = 0;
    }
    public Monster(String name, int health, int low_attack, int high_attack, int speed){
        this.name = name;
        this.health = health;
        this.low_attack = low_attack;
        this.high_attack = high_attack;
        this.speed = speed;
    }
    public int getDamage(){
        int attack = high_attack - low_attack;
        int damage = (int)(Math.random()*attack + 1);
        return damage;
    }
    public int getX(){
        return xpos;
    }
    public int getY(){
        return ypos;
    }    
    public int getSpeed(){
        return speed;
    }
    public int getHealth(){
        return health;
    }
    public String getName(){
        return name;
    }    
}