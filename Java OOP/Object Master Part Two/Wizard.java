public class Wizard extends Human{
    public int health=50;
    public int intelligence =8;
    public Wizard()
    {
        
    }
    public void heal(Human player){
        player.setHelth(player.getHelth()+(player.getIntelligence()));
        
    }
    public void fireball(Human secondHuman)
    {
        secondHuman.setHelth(secondHuman.getHelth() - (this.intelligence*3));
    }
}