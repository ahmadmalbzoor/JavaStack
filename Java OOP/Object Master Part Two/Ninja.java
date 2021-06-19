public class Ninja extends Human{
    public int stealth =10;
    public Ninja()
    {
        
    }
    public void steal(Human secondHuman)
    {
        secondHuman.setHelth(secondHuman.getHelth()-this.stealth);
        this.setHelth(this.getHelth()+ this.stealth) ;
    }
    public void runAway()
    {
        this.setHelth(this.getHelth()-10);
    }
}