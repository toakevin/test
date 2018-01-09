import java.io.*;
import java.util.*;
public class Driver{
    public static void main(String args[]){
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        
        Object[][] map = new Object[10][10];
        
        Hero hiro = new Hero();
        map[hiro.getY()][hiro.getX()] = hiro;

        Monster snake = new Monster("Viper", 50, 0, 50, 2);
        int xpos1 = (int)(Math.random()*9 + 1);
        int ypos1 = (int)(Math.random()*9 + 1);
        map[ypos1][xpos1] = snake;
        System.out.println(snake.getY() + ", " + snake.getX());
        Monster orge = new Monster("Balrog", 200, 5, 15, 0);
        int xpos2 = (int)(Math.random()*9 + 1);
        int ypos2 = (int)(Math.random()*9 + 1);
        map[ypos2][xpos2] = orge;       
        Monster dragon = new Monster("Eragon", 150, 15, 30, 3);
        int xpos3 = (int)(Math.random()*9 + 1);
        int ypos3 = (int)(Math.random()*9 + 1);
        map[ypos3][xpos3] = dragon;   
        Monster lion = new Monster("Scar", 100, 10, 20, 2);
        int xpos4 = (int)(Math.random()*9 + 1);
        int ypos4 = (int)(Math.random()*9 + 1);
        map[ypos4][xpos4] = lion;
        Monster human = new Monster("Irie", 100, 0, 30, 1);
        int xpos5 = (int)(Math.random()*9 + 1);
        int ypos5 = (int)(Math.random()*9 + 1);
        map[ypos5][xpos5] = human;
        Monster boss = new Monster("Hades", 300, 25, 75, 0);
        int xpos6 = (int)(Math.random()*9 + 1);
        int ypos6 = (int)(Math.random()*9 + 1);
        map[ypos6][xpos6] = boss;
         
        Potion potion1 = new Potion("Elixer", 100);
        map[potion1.getY()][potion1.getX()] = potion1;    
        Potion potion2 = new Potion("Jug", 100);
        map[potion2.getY()][potion2.getX()] = potion2;         
        
        Armor armor1 = new Armor("chainmail", 50);
        map[armor1.getY()][armor1.getX()] = armor1;
        
        Scanner move = new Scanner(System.in);
        Scanner monster_move = new Scanner(System.in);
        
        while(true){
            printMap(map);
            int preX = hiro.getX();
            int preY = hiro.getY();     
            System.out.print("What's ur move( w(north), s(south), a(west), d(east), p(potion)\n");
            String movement = move.nextLine();
            movement = movement.toLowerCase();
            if(hiro.isValidMov(movement)){
                if(movement.equals("w")){
                    hiro.setY(-1);
                }
                else if(movement.equals("s")){
                    hiro.setY(1);
                }
                else if(movement.equals("a")){
                    hiro.setX(-1);
                }
                else if(movement.equals("d")){
                    hiro.setX(1);
                }
                else if(movement.equals("p")){
                    hiro.usePotion();
                }
                
                if((hiro.getY() == ypos1 && hiro.getX() == xpos1 || hiro.getY() == ypos2 && hiro.getX() == xpos2 || hiro.getY() == ypos3 && hiro.getX() == xpos3 || hiro.getY() == ypos4 && hiro.getX() == xpos4 || hiro.getY() == ypos5 && hiro.getX() == xpos5 || hiro.getY() == ypos6 && hiro.getX() == xpos6)){
                   Monster m = (Monster)map[hiro.getY()][hiro.getX()];
                   
                   System.out.print("What's ur move? (run, attack) ");
                   String monster_movement = monster_move.nextLine();
                   switch(monster_movement){
                       case "run": 
                        int remainingH = hiro.getHealth() - m.getDamage();
                        System.out.println("Remaining health: " + remainingH);
                        if(m.getSpeed() == 0){
                            if(movement.equals("w")){                                        
                                hiro.setY(preY - hiro.getY());     
                            }
                            else if(movement.equals("s")){
                                hiro.setY(hiro.getY() - preY);
                            }
                            else if(movement.equals("a")){
                                hiro.setX(hiro.getX() - preX);
                            }
                            else if(movement.equals("d")){
                                hiro.setX(preX - hiro.getX());
                            }
                        }
                        else if(m.getSpeed() == 1){
                            
                            while(a==0){
                                int variable1 = (int)(Math.random()* 100 + 1);
                                if(variable1 >= 20){
                                    a++;
                                    if(movement.equals("w")){                                        
                                        hiro.setY(preY - hiro.getY());     
                                    }
                                    else if(movement.equals("d")){
                                        hiro.setY(hiro.getY() - preY);
                                    }
                                    else if(movement.equals("a")){
                                        hiro.setX(hiro.getX() - preX);
                                    }
                                    else if(movement.equals("d")){
                                        hiro.setX(preX - hiro.getX());
                                    }                                  
                                }
                                else{
                                    System.out.print("You failed to run. What's ur move? (run, attack) ");
                                    monster_movement = monster_move.nextLine();;
                                } 
                            }
                        }
                        else if(m.getSpeed() == 2){
                            
                            while(b==0){
                                int variable2 = (int)(Math.random()* 100 + 1);
                                if(variable2 >= 50){
                                    b++;
                                    if(movement.equals("w")){                                        
                                        hiro.setY(preY - hiro.getY());     
                                    }
                                    else if(movement.equals("d")){
                                        hiro.setY(hiro.getY() - preY);
                                    }
                                    else if(movement.equals("a")){
                                        hiro.setX(hiro.getX() - preX);
                                    }
                                    else if(movement.equals("d")){
                                        hiro.setX(preX - hiro.getX());
                                    }                                          
                                }
                                else{
                                    System.out.print("You failed to run. What's ur move? (run, attack) ");
                                    monster_movement = monster_move.nextLine();  
                                }
                            }
                        }
                        else if(m.getSpeed() == 3){
                            
                            while(c==0){    
                                int variable3 = (int)(Math.random()* 100 + 1);
                                if(variable3 >= 80){
                                    c++;
                                    if(movement.equals("w")){                                        
                                        hiro.setY(preY - hiro.getY());     
                                    }
                                    else if(movement.equals("d")){
                                        hiro.setY(hiro.getY() - preY);
                                    }
                                    else if(movement.equals("a")){
                                        hiro.setX(hiro.getX() - preX);
                                    }
                                    else if(movement.equals("d")){
                                        hiro.setX(preX - hiro.getX());
                                    }                                                                                                                                         
                                }
                                else{
                                    System.out.print("You failed to run. What's ur move? (run, attack) ");
                                    monster_movement = monster_move.nextLine();   
                                }
                            }
                        }
                        break;    
                       case "attack": 
                        int damage_dealt = hiro.getWeapon().getDamage();
                        while(d == 0){    
                            if(hiro.getY() == ypos2 && hiro.getX() == xpos2){
                                    int remaining_health1 = orge.getHealth() - damage_dealt;
                                    System.out.println("Damage dealt: " + damage_dealt);

                                    if(remaining_health1 <= 0){
                                        System.out.println("The orge has been slain.");
                                        map[preY][preX] = null;
                                        map[hiro.getY()][hiro.getX()] = hiro;                                        
                                        d++;
                                    }
                                }
                                else if(hiro.getY() == ypos1 && hiro.getX() == xpos1){
                                    int remaining_health2 = snake.getHealth() - damage_dealt;
                                    System.out.println("Damage dealt: " + damage_dealt);

                                    if(remaining_health2 <= 0){
                                        System.out.println("The snake has been slain.");
                                        map[preY][preX] = null;
                                        map[hiro.getY()][hiro.getX()] = hiro;
                                        d++;
                                    }   
                                }
                                else if(hiro.getY() == ypos3 && hiro.getX() == xpos3){
                                    int remaining_health3 = dragon.getHealth() - damage_dealt;
                                    System.out.println("Damage dealt: " + damage_dealt);

                                    if(remaining_health3 <= 0){
                                        System.out.println("The dragon has been slain.");
                                        map[preY][preX] = null;
                                        map[hiro.getY()][hiro.getX()] = hiro;                                        
                                        d++;
                                    }     
                                }
                                else if(hiro.getY() == ypos4 && hiro.getX() == xpos4){
                                    int remaining_health4 = lion.getHealth() - damage_dealt;
                                    System.out.println("Damage dealt: " + damage_dealt);

                                    if(remaining_health4 <= 0){
                                        System.out.println("The lion has been slain.");
                                        map[preY][preX] = null;
                                        map[hiro.getY()][hiro.getX()] = hiro;                                        
                                        d++;
                                    }
                                }
                                else if(hiro.getY() == ypos6 && hiro.getX() == xpos6){
                                    int remaining_health5 = boss.getHealth() - damage_dealt;
                                    System.out.println("Damage dealt: " + damage_dealt);

                                    if(remaining_health5 <= 0){
                                        System.out.println("The boss has been slain.");
                                        map[preY][preX] = null;
                                        map[hiro.getY()][hiro.getX()] = hiro;                                        
                                        d++;
                                    }   
                                }
                                else if(hiro.getY() == ypos5 && hiro.getX() == xpos5){
                                    int remaining_health6 = human.getHealth() - damage_dealt;
                                    System.out.println("Damage dealt: " + damage_dealt);

                                    if(remaining_health6 <= 0){
                                        System.out.println("The human has been slain.");
                                        map[preY][preX] = null;
                                        map[hiro.getY()][hiro.getX()] = hiro;                                        
                                        d++;
                                    }       
                                }
                        }
                        break;
                        //some line of code for attacking mechanism
                        
                    }
                }
                else{
                    map[preY][preX] = null;
                    map[hiro.getY()][hiro.getX()] = hiro;                      
                }

                
            }
            
            else{
                System.out.println("Error. Out of the map.");
            }
            
        }
        
        
    }
    
    public static void printMap(Object[][] map){
        for(int i = 0; i < map.length; ++i){
            for(int j = 0; j < map[0].length;++j){
                if(map[i][j] == null){                    
                    map[i][j] = ".";
                    
                }
                System.out.print(map[i][j] + "   " );
            }
            System.out.println();
        }
    }
    
    
}