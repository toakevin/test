public class Armor{
    private String name;
    private int amount_of_armor;
    private int xpos;
    private int ypos;   
    public Armor(String name, int amount_of_armor){
        this.name = name;
        this.amount_of_armor = amount_of_armor;
    }
    public int getX(){
        xpos = (int)(Math.random()*9 + 1);
        return xpos;
    }
    public int getY(){
        ypos = (int)(Math.random()*9 + 1);
        return ypos;
    }     
    public String getName(){
        return name;
    }    
}
