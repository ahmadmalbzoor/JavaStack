public class Human{
    private int strength=3;
    private int stealth=3;
    private int intelligence=3;
    private int health=100;
    public Human(){
        
    }
    
    public int attack(Human attacked )
    {
        attacked.health-=this.strength;
        return attacked.health;
    }
   
    public void setStrength(int strength){
        this.strength=strength;
    }
    public int getStrength()
    {
        return this.strength;
    }
    
    public void setStealth(int stealth){
        this.stealth=stealth;
    }
    public int getStealth()
    {
        return this.stealth;
    }
    
    public void setIntelligence(int intelligence){
        this.intelligence=intelligence;
    }
    public int getIntelligence()
    {
        return this.intelligence;
    }
    
    public void setHelth(int health){
        this.health=health;
    }
    public int getHelth()
    {
        return this.health;
    }
    
}