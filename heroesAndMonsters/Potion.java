public class Potion{
    private String name;
    private int health_gained;
    Hero hiro = new Hero();
    private int xpos;
    private int ypos;    
    public Potion(String name, int health_gained){
        this.name = name;
        this.health_gained = health_gained;
    }
    public int getHealth_gained(){
        return health_gained;
    }
    public int getX(){
        xpos = (int)(Math.random()*9 + 1);
        return xpos;
    }
    public String getName(){
        return name;
    }    
    public int getY(){
        ypos = (int)(Math.random()*9 + 1);
        return ypos;
    }      
}
