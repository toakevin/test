public class Hero{
    private String name;
    private int xpos;
    private int ypos;
    private int health;
    private Weapon weapon;
    private Potion health_potion;
    public Hero(){
        name = "Bob";
        xpos = 0;
        ypos = 0;
        health = 100;
        weapon = new Weapon("dagger", 10, 30);
    }
    public int getX(){
        return xpos;
    }
    public int getY(){
        return ypos;
    }
    public Weapon getWeapon(){
        return weapon;
    }
    public int setX(int x_amount){
        xpos = xpos + x_amount;
        return xpos;
    }
    public int setY(int y_amount){
        ypos = ypos + y_amount;
        return ypos;
    }
    public int getHealth(){
        return health;
    }
    public String getName(){
        return name;
    }
    public int usePotion(){
        int new_health = health + health_potion.getHealth_gained();
        return new_health;
    }
    public boolean isValidMov(String move){
        move = move.toLowerCase();
        
        if(move.equals("a")){
            if(xpos == 0){
                return false;
            }
        }
        else if(move.equals("w")){
            if(ypos == 0){
                return false;
            }
        }
        else if(move.equals("s")){
            if(ypos == 9){
                return false;
            }
        }
        else if(move.equals("d")){
            if(xpos == 9){
                return false;
            }
        }
        else{
            return true;
        }
        return true;
    }
}
