public class Samurai extends Human{
    private int health = 200;
    public Samurai()
    {
        
    }
    public indeathBlow(Human secondHuman)
    {
        secondHuman.setHelth(0);
        this.setHelth(this.getHelth()/2);
    }
    public meditate()
    {
      this.setHelth(this.getHelth+(this.getHelth/2));  
    }
    public howMany()
    {
        int count=0;
        count++;
        return count;
    }
}